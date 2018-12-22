/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpSession;
/**
 *
 * @author dell
 */
public class NewAcServ extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String s= "success";

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
            throws Exception
    {
        HttpSession session=null;
        session=request.getSession();
        session.setAttribute("acno",request.getParameter("acno"));
        request.setAttribute("branch",request.getLocalName());
        ClBean  cb=(ClBean)form;
        if (cb.getAcno()=="" && cb.getAct_type()=="" && cb.getBranch()=="" && cb.getUname()=="" && cb.getPass()=="" )
        {
            response.sendRedirect("newac_body.jsp?msg=error");
        }
        ClModel cm=new ClModel();
        s=cm.cl_insert(cb);

        if(s.equals("success"))
        {
            session.setAttribute("id","yes");
            s="success";
        }
        else
        {
            s="failure";
        }

        return mapping.findForward(s);
    }
}
