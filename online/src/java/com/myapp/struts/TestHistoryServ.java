/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;
import java.util.*;
/**
 *
 * @author Nancy
 */
public class TestHistoryServ extends org.apache.struts.action.Action {
    
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
        Result r = null;
        HttpSession hs = request.getSession();
        String uname = (String)hs.getAttribute("uname");
        int i;
        try
        {
         tx = session.beginTransaction();
         Query q = session.createQuery("from Result where uname=?");
         q.setString(0, uname);
         List l = q.list();
         ArrayList al = new ArrayList();
         String d = null,dd=null;
         DateFormat ft = new SimpleDateFormat("dd-mm-yy");
         
          request.setAttribute("history", l);

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
