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
import javax.servlet.http.HttpSession;
/**
 *
 * @author dell
 */
public class NewFundServ extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String s = "success";

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
        HttpSession session=request.getSession();
        FundBean fb=(FundBean)form;
        FundModel fm=new FundModel();
        s=fm.fund_insert(fb);

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
