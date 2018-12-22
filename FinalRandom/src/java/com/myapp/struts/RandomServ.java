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

/**
 *
 * @author Nancy
 */
public class RandomServ extends org.apache.struts.action.Action {
    
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

         int n=0;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
      Tryrandom tm = null;
       String s = null;
       //int size = Integer.parseInt(request.getParameter("size")),j,k=1;
       int size=5, j,k=1;
       Tryrandom t = (Tryrandom)form;
        ArrayList al=new ArrayList();
        RequestDispatcher rd = null;

       try{
           //Random rm = new Random();
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Tryrandom ");
           List l=q.list();
          Tryrandom arr[] = new Tryrandom[ l.size()];



         Random rr = new Random();


             for(int i=0;i<(3*(l.size()));i++){
                 int a = rr.nextInt(l.size());
             tm =(Tryrandom)l.get(a);
             if(tm.getClev().equals(t.getClev())){
              if(n==0){
                  arr[n] = (Tryrandom) l.get(a);
                  n++;
                  continue;
              }
              for( j=0;j<n;j++){
                    if(arr[j]==l.get(a)){
                     //System.out.println("Hello");
                      break;
                    }

              }
             if(j==n){
                  arr[n] = (Tryrandom) l.get(a);
                  n++;
             }

             }

            }

            al.add(tm);
          request.setAttribute("data", al);
          rd = request.getRequestDispatcher("ques.jsp");
          rd.forward(request, response);
          response.sendRedirect("ques.jsp");
            

                 tx.commit();
           session.close();

       }
       catch(Exception e){
           System.out.println(e.toString());
       }
        return mapping.findForward(SUCCESS);
    }
}
