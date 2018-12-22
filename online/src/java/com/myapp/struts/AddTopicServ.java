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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nancy
 */
public class AddTopicServ extends org.apache.struts.action.Action {
    
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
            Topic tp=(Topic)form;
            HttpSession hs = request.getSession();
           try
          {
          tx = session.beginTransaction();
          tp.setSubject(new Subject(request.getParameter("scode")));
          Query q = session.createQuery("from Subject");
          List l = q.list();
          hs.setAttribute("sublist", l);

          session.save(tp);
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
