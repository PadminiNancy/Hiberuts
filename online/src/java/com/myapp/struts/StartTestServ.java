/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;
import java.util.*;
import javax.servlet.http.HttpSession;
import java.text.*;


/**
 *
 * @author Nancy
 */
public class StartTestServ extends org.apache.struts.action.Action {
    
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
       RequestDispatcher rd = null;
       ArrayList al = new ArrayList();
       HttpSession hs = request.getSession();
       String date="";
       int marks = 0;
       String uname = (String)hs.getAttribute("uname");
       try{
           tx = session.beginTransaction();
           al.add(qu);

            DateFormat df = new SimpleDateFormat("dd-MMM-yy");
            Date dt = new Date();
            Calendar dnow = Calendar.getInstance();
            date = df.format(dnow.getTime());
            hs.setAttribute("date", date);
            hs.setAttribute("sdata", new String(qu.getScode()));
            hs.setAttribute("marks", new Integer(marks));
            if(uname!=null)
             response.sendRedirect("QuesGenServ.do");
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }


        return mapping.findForward(SUCCESS);
    }
}
