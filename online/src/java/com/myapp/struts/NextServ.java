/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Nancy
 */
public class NextServ extends org.apache.struts.action.Action {
    
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

                 HttpSession hs = request.getSession();
                  ServletContext context = servlet.getServletContext();
                  RequestDispatcher rd = null;
                int i =  ((Integer)hs.getAttribute("current")).intValue();
               int fn =  ((Integer)context.getAttribute("ndata")).intValue();
              ArrayList l1 = (ArrayList)hs.getAttribute("rdata");
               ArrayList l2 = (ArrayList)hs.getAttribute("vdata");
               
              
               String  ans   =   (String)request.getParameter("cans");
              
             if(ans!=null)
             {
                 l1.set(i, ans);
                 l2.set(i, ans);
             }
               else
               {
                   l1.set(i,"f");
                   l2.set(i, " ");
               }
             hs.setAttribute("rdata", l1);
              hs.setAttribute("vdata", l2);

              
              if(i!=(fn-1))
              {

               hs.setAttribute("current",new Integer(i+1));
              
               response.sendRedirect("QdispServ.do");
              }
              else
              {
                 //  hs.setAttribute("current",new Integer(i));
               response.sendRedirect("QdispServ.do");
              }
         
          
        

        return mapping.findForward(SUCCESS);
    }
}
