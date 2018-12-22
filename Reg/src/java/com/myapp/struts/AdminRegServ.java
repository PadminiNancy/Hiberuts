/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class AdminRegServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        HttpSession hs = request.getSession();
        Loginn lg = new Loginn();
        String uname = (String)hs.getAttribute("uname");
        String pass = (String)hs.getAttribute("pass");

        List l = (List)hs.getAttribute("adata");
        Reg r = (Reg)l.get(0);

        try{

         tx = session.beginTransaction();
         lg.setPass(pass);
         lg.setUname(uname);
         session.save(lg);
         FormFile photo1 = r.getPhoto1();
         String filePath= getServlet().getServletContext().getRealPath("/")+"aphoto";
         new UploadHelper().uploadNow(photo1,filePath,uname,"jpg");

            r.setPhoto(filePath);

        
         r.setLoginn(lg);
        
         session.save(r);
         
         tx.commit();
         session.close();
        }
        catch(Exception e)
        {
         System.out.println(e.toString());
        }

        
        return mapping.findForward(SUCCESS);
    }
}
