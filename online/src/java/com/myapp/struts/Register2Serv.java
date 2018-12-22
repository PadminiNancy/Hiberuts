/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;
import java.text.*;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Nancy
 */
public class Register2Serv extends org.apache.struts.action.Action {
    
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

        URegister stu=(URegister)form;

         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         Transaction tx = null;
         HttpSession hs = request.getSession();
         //String uname = (String)hs.getAttribute("uname");
         String pass = (String)hs.getAttribute("pass");
     try{
         tx = session.beginTransaction();
        /* DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
         stu.setDob(df.format(new Date()));*/
         Login l = new Login();
         l.setUname(stu.getUname());
         stu.setLogin(l);
         l.setPass(pass);

         FormFile photo1 = stu.getPhoto1();
         String filePath= getServlet().getServletContext().getRealPath("/")+"uphoto";
         new UploadHelper().uploadNow(photo1,filePath,stu.getUname(),"jpg");
           
            stu.setPhoto(filePath);
            session.save(l);
            session.save(stu);
            tx.commit();
            session.close();




        
         hs.setAttribute("user", stu);
     }
     catch(Exception e)
     {
         response.sendRedirect("errors.jsp?msg="+e.toString());
     }



        return mapping.findForward(SUCCESS);
    }
}
