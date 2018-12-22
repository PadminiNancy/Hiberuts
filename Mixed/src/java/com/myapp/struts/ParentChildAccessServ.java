/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public class ParentChildAccessServ extends org.apache.struts.action.Action {
    
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
       ArrayList al=new ArrayList();
       RequestDispatcher rd = null;
       try{
           tx = session.beginTransaction();
           Loginid ld = new Loginid();
             Query q= session.createQuery(" From Loginid");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {
            ld=(Loginid)l.get(i);
           // System.out.print(sd.getRoll()+"\t"+sd.getName()+" ");

            Iterator iter = ld.getRegisters().iterator();
            while(iter.hasNext())
            {

              Register r1 = (Register) iter.next();
             // System.out.println(r1.getRoll() +"\t" + r1.getUname());
              al.add(r1);
          request.setAttribute("data", al);
          rd = request.getRequestDispatcher("welcome.jsp");
          rd.forward(request, response);
          response.sendRedirect("welcome.jsp");
            }

           tx.commit();
           session.close();
          
       }
       }
       catch(Exception e){
           response.sendRedirect("errors.jsp?msg="+e.toString());
       }

       return mapping.findForward(SUCCESS);
    }
}
