/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.util.*;
import javax.servlet.RequestDispatcher;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class QdispServ extends org.apache.struts.action.Action {
    
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
        
         RequestDispatcher rd = null;
         
         //System.out.println(i);
        
         try{
           tx = session.beginTransaction();
           Integer ii =  ((Integer)hs.getAttribute("current"));
           int i = ii.intValue();
          
            request.setAttribute("sno",i+1);
            List ll = (List)hs.getAttribute("odata");
           Question q = (Question)ll.get(i);
           String photo = (String)q.getQuesimg();
           request.setAttribute("curquest",q);
            request.setAttribute("qphoto",photo);


           tx.commit();
           session.close();
         }
         catch(Exception e){
           System.out.println(e.toString());
         }




        return mapping.findForward(SUCCESS);
    }
}
