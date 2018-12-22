/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Nancy
 */
public class RegisterServ extends org.apache.struts.action.Action {
    
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

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        {
            try
            {
                EmailSender es = new EmailSender();
                String s= es.sendMail("pdmnnancy@gmail.com", "technofobia", "pdmnnancy@gmail.com", "nancy0223@rediffmail.com", "emailcheck", "hello?");
            if(s.equals("success"))
                response.sendRedirect("send.jsp");
            else
                response.sendRedirect("error.jsp");
            }catch(Exception e)
            {
                System.out.println(e.toString());
            }
            finally
            {
                out.close();
            }
        return mapping.findForward(SUCCESS);
    }
    }
}
