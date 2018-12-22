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
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nancy
 */
public class QuesGenServ extends org.apache.struts.action.Action {
    
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
       Question tm = null;
       Question qd = null;
       String s = null, sv = null;
       int j,k=1,a,i,n=0,w=1;
       boolean f=true;
       ArrayList al = new ArrayList();
       ArrayList ad = new ArrayList();
       ArrayList<String> ul = new ArrayList<String>();
        ArrayList<String> vl = new ArrayList<String>();
      
       ServletContext context=servlet.getServletContext();
        HttpSession hs = request.getSession();
        Question ques = new Question();        
        int fn = ((Integer)context.getAttribute("ndata")).intValue();

      
         String clev =  (String) context.getAttribute("ldata");
         String scode =  (String) hs.getAttribute("sdata");
        
         
        
       int c = 0;
       
      
      

       try{
           
           tx = session.beginTransaction();
           
           Query q= session.createQuery(" From Question where clev=? and scode=?");
           q.setString(0, clev);
           q.setString(1, scode);
          
           List l = q.list();
          Question arr[] = new Question[ l.size()];
         /* String au[] = new String[l.size()];
          for(i=0;i<l.size();i++)
              au[i] = " ";*/



         Random rr = new Random();


            while(n<l.size())
            {
             a = rr.nextInt(l.size());
             for(i=0;i<arr.length;i++)
             {
               if(arr[i]==l.get(a))
               {
                   f = false;
                   break;

               }
             }
             if(f)
             {
               arr[n] = (Question) l.get(a);
               al.add((Question)l.get(a));
               Question qr = (Question)l.get(a);
              // s = qr.getCans();
               s = "f";
               sv = " ";
               ul.add(s);
               vl.add(sv);
               n++;
             }
             else
                 f = true;
            }
           
           

              for(i=0;i<fn;i++)
              {
               
                ad.add(al.get(i));
               
              }
          
         //  hs.setAttribute("qdata",ad);
           hs.setAttribute("odata", ad);
           hs.setAttribute("rdata", ul);
           hs.setAttribute("vdata", vl);
           hs.setAttribute("current", new Integer(c));
           hs.setAttribute("final",new Integer(fn));
           
           
                 tx.commit();
           session.close();
           response.sendRedirect("QdispServ.do");


       }
       catch(Exception e){
           response.sendRedirect("errors.jsp?msg="+e.toString());
       }

        return mapping.findForward(SUCCESS);
    }
}
