/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class InsertServ extends org.apache.struts.action.Action {
    
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

         Updation stu=(Updation)form;

         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         Transaction tx = null;
     try{
         tx = session.beginTransaction();
         DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
         stu.setDoa(df.format(new Date()));
         

         FormFile photo1 = stu.getPhoto1();
         String filePath= getServlet().getServletContext().getRealPath("/")+"uphoto";
         new UploadHelper().uploadNow(photo1,filePath,stu.getUname(),"jpg");

            stu.setPhoto(filePath);
            
         session.save(stu);
         tx.commit();
         session.close();

        
         
        
         HttpSession hs = request.getSession();
         hs.setAttribute("student", stu);
        
     }
     catch(Exception e)
     {
         response.sendRedirect("error.jsp?msg="+e.toString());
     }


        return mapping.findForward(SUCCESS);
    }
}
