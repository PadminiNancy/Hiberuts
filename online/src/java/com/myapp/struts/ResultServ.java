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
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class ResultServ extends org.apache.struts.action.Action {
    
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
             HttpSession hs = request.getSession();
             ServletContext context = servlet.getServletContext();
              int i =  ((Integer)hs.getAttribute("current")).intValue();
               int fn =  ((Integer)context.getAttribute("ndata")).intValue();
               float pa =0;

               String date = (String)hs.getAttribute("date");

               String uname = (String)hs.getAttribute("uname");
               String scode = (String)hs.getAttribute("sdata");
              ArrayList l = (ArrayList)hs.getAttribute("rdata");
               ArrayList ll = (ArrayList)hs.getAttribute("vdata");


               String  ans   =   (String)request.getParameter("cans");

             if(ans!=null)
             {
                 l.set(i, ans);
                 ll.set(i, ans);
             }
               else
               {
                   l.set(i,"f");
                   ll.set(i, " ");
               }
             hs.setAttribute("rdata", l);
              hs.setAttribute("vdata", ll);

            int omarks =  Integer.parseInt(hs.getAttribute("marks").toString());
            List l2 = (List)hs.getAttribute("odata");
             List l1 = (List)hs.getAttribute("rdata");
             ArrayList at = new ArrayList();
             ArrayList atm = new ArrayList();
             ArrayList aom = new ArrayList();

             Question q = new Question();
             String an ="";

             String topic="";
            String wktp ="",wktopic="",tp="";
            
            Topic t = null;
             Topic s = null;
           
            String tarr[] = new String[l1.size()];
            int ttarr[] = new int[l1.size()];
            int otarr[] = new int[l1.size()];
            boolean flag = true;
            int n=0,j=0,u,m=0,tm=0;

            WrongTopic wt = new WrongTopic();
         try
         {
             tx = session.beginTransaction();
            for(u=0;u<l1.size();u++)
               tarr[u] = " ";
            
            for(u=0;u<fn;u++)
            {
             an = (String)l1.get(u);
             q = (Question)l2.get(u);
             tm = tm+q.getMarks();
             topic = q.getTopic().getTcode();

             for(j=0;j<tarr.length;j++)
             {
              if(tarr[j].equals(topic))
              {
               flag = false;
               break;
              }
             }
             if(flag)
             {
              ttarr[m]=0;
              otarr[m] = 0;
              tarr[m] = topic;
              ttarr[m] = ttarr[m]+q.getMarks();
              
               if(an.equals(q.getCans()))
               {
                otarr[m] = otarr[m]+q.getMarks();
                omarks = omarks+q.getMarks();
               }
              m++;
             }
             else
             {
              ttarr[j] = ttarr[j]+q.getMarks();
              
              if(an.equals(q.getCans()))
              {
               otarr[j] = otarr[j]+q.getMarks();
               omarks = omarks+q.getMarks();
              }
              flag = true;
             }
            }
              
            
               //  response.sendRedirect("errors.jsp?msg="+tm+" "+omarks+" "+m+" "+tarr[m-1]);
             int minm = otarr[0];
             int max = otarr[0];
             wktp = tarr[0];
             String alt = null, stp = tarr[0], strong = null;
             int tma= 0, oma = 0;
             for(u=0;u<m;u++)
             {
             
              tp = tarr[u];
             t = (Topic)session.get(Topic.class, tp);
              wt.setTopic(t.getTopic());
              wt.setTmarks(ttarr[u]);
              wt.setOmarks(otarr[u]);
              alt = t.getTopic();
              tma = ttarr[u];
              oma = otarr[u];
              at.add(alt);
              atm.add(tma);
              aom.add(oma);
              pa = (otarr[u]*100)/ttarr[u];
              if(pa<minm)
              {
                  minm = otarr[u];
                  wktp = tarr[u];

              }
              if(pa>max)
              {
                  max = otarr[u];
                  stp = tarr[u];

              }
             }
             
              t = (Topic)session.get(Topic.class,wktp);
               wktopic = t.getTopic();
               s = (Topic)session.get(Topic.class,stp);
                strong = s.getTopic();
             hs.setAttribute("weakarea", new String(wktopic));
             hs.setAttribute("strong", new String(strong));
             
             hs.setAttribute("topic", at);
             hs.setAttribute("tmarks", atm);
             hs.setAttribute("obtained", aom);
             hs.setAttribute("marks", omarks);
              hs.setAttribute("total", tm);
              hs.setAttribute("m", m);
              hs.setAttribute("min", minm);
              hs.setAttribute("max", max);
               hs.setAttribute("pa", pa);
            
            
            // response.sendRedirect("errors.jsp?msg="+omarks+" "+wktopic);
             Result r = new Result();
             Login lg = new Login();
             lg.setUname(uname);
             r.setDot(date);
             r.setLogin(lg);
             r.setTmarks(tm);
             r.setOmarks(omarks);
             r.setScode(scode);
             r.setWa(wktopic);
             session.save(r);
             tx.commit();
             session.close();

             
         }
          

           
             catch(Exception e)
             {
                // response.sendRedirect("errors.jsp?msg="+e.toString());
             }


        return mapping.findForward(SUCCESS);
    }
}
