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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

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
   ArrayList al = new ArrayList();
   HttpSession hs = request.getSession();
   int marks = 0;
   

   try
   {
       tx = session.beginTransaction();

       Login l = (Login)form;
       String uname = request.getParameter("uname");
       Login ld = (Login)session.get(Login.class, l.getUname());
       Query qs = session.createQuery("from Subject");
       List ls = qs.list();

      if(ld!=null)
      {
       if((l.getPass().equals(ld.getPass())))
       {
          
           hs.setAttribute("uname", l.getUname());
           Query q = session.createQuery("from URegister where uname=?");
           q.setString(0, uname);
          
           List ll = q.list();
           URegister u = (URegister)ll.get(0);


            hs.setAttribute("userdata", ll);
            hs.setAttribute("photo", u.getPhoto());
            hs.setAttribute("sublist", ls);
           response.sendRedirect("userhome.jsp");
       }
       else
           response.sendRedirect("home.jsp");
      }
      else
          response.sendRedirect("home.jsp");
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
