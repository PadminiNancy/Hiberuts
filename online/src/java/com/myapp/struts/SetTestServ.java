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
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Nancy
 */
public class SetTestServ extends org.apache.struts.action.Action {
    
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
       Question qu = (Question)form;

       ArrayList al = new ArrayList();
       HttpSession hs = request.getSession();
       
       try{
           tx = session.beginTransaction();
           al.add(qu);
           int s = Integer.parseInt(request.getParameter("noq"));
           String clev = request.getParameter("clev");
           int ap = Integer.parseInt(request.getParameter("ap"));

           ServletContext context = servlet.getServletContext();
           
           context.setAttribute("ndata", new Integer (s));
           context.setAttribute("ldata", new String(clev));
           hs.setAttribute("noq", new Integer (s));
           hs.setAttribute("clev", new String(clev));

           if(ap==0)
               response.sendRedirect("finish.jsp");
           else
               response.sendRedirect("next.jsp");
           
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }


        return mapping.findForward(SUCCESS);
    }
}
