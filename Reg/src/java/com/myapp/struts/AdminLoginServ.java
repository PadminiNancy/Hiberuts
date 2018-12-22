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
import java.util.*;

/**
 *
 * @author Nancy
 */
public class AdminLoginServ extends org.apache.struts.action.Action {
    
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
          Loginn l = new Loginn();
          String uname = request.getParameter("uname");
          String pass = request.getParameter("pass");
         SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    Transaction tx = null;
    try{
        tx = session.beginTransaction();
        System.out.println("Yiepie!!:)");
        l.setUname(uname);
        l.setPass(pass);
        session.save(l);
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
