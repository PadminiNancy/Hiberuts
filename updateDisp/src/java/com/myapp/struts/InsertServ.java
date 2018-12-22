/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.io.*;
//import java.io.FileOutputStream;
import java.text.*;
//import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

         SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();

          
          Updation ub=(Updation)form;
          DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
          ub.setDoa(df.format(new Date()));
          FormFile mfile=ub.getTheFile();
          
          Transaction tx = null;
         try
         {
         tx = session.beginTransaction();
         String fname=mfile.getFileName();
          String filePath=getServlet().getServletContext().getRealPath("/")+"upload";
          File file=new File(filePath,fname);
         if(!file.exists())
       {
           ub.setFilename(fname);
           byte[] bFile = new byte[(int)file.length()];
           FileInputStream fi = new FileInputStream(file);
           fi.read(bFile);
           fi.close();
           ub.setPic(bFile);
           session.save(ub);
           tx.commit();
         }
       else
       {
        request.setAttribute("msg", "file alrady exist...");
       }

       }
         catch(HibernateException e)
       {
        response.sendRedirect("errors.jsp?msg="+e.toString());
       }



        return mapping.findForward(SUCCESS);
    }
}
