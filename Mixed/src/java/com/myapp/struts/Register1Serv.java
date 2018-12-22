/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class Register1Serv extends org.apache.struts.action.Action {
    
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
        RequestDispatcher rd = null;
        ArrayList al=new ArrayList();
        try
        {
          tx = session.beginTransaction();

          Loginid l =(Loginid)form;
          session.save(l);
          tx.commit();
          al.add(l);
          request.setAttribute("data", al);
          rd = request.getRequestDispatcher("register_tiles1.jsp");
          rd.forward(request, response);
          response.sendRedirect("register_tiles1.jsp");
          session.close();
        }

        catch(Exception e)
        {
          response.sendRedirect("errors.jsp?msg="+e.toString());
        }


        return mapping.findForward(SUCCESS);
    }
}
