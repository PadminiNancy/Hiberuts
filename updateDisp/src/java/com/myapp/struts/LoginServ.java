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
import org.apache.struts.upload.FormFile;
import java.io.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author Nancy
 */
public class LoginServ extends org.apache.struts.action.Action {
    
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

   try
   {
       tx = session.beginTransaction();

       Updation l = (Updation)form;

       Updation ld = (Updation)session.get(Updation.class, l.getUname());

       if((l.getUname().equals(ld.getUname()))&&(l.getPass().equals(ld.getPass())))

           response.sendRedirect("userProf.jsp");
       else
           response.sendRedirect("login.jsp");
       tx.commit();
       session.close();
   }

   catch(Exception e)
   {
     response.sendRedirect("errors.jsp?msg="+e.toString());
   }

        return mapping.findForward(SUCCESS);
    }
}
