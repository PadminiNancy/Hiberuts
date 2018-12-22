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

/**
 *
 * @author dell
 */
public class ModiTranServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private  String s = "success";
    
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

        TranModel tm=new TranModel();
        TranBean tb=tm.getTran(request.getParameter("tr_id"));
        if(tb!=null)
        {
            request.setAttribute("ac",tb);
            s="success";
        }
        else
        {
            s="failure";
        }
        return mapping.findForward(s);
    }
}
