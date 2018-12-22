/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
/**
 *
 * @author pallav
 */
public class EmpBean extends org.apache.struts.action.ActionForm
{

     private String emp_code;
     private String bcode;
     private String ename;
     private String pass;

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
 /*   @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getEmp_code() == null || getEmp_code().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.empcode"));

        }
        else if(getBcode() == null || getBcode().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.br"));

        }
        else if(getEname() == null || getEname().length()<6)
        {
           errors.add("pass_err", new ActionMessage("error.ename"));

        }
        else if(getPass() == null || getPass().length()<1)
        {
            errors.add("act_err",new ActionMessage("error.pass"));
        }
        return errors;
    }

    /**
     * @return the emp_code
     */
    public String getEmp_code()
    {
        return emp_code;
    }

    /**
     * @param emp_code the emp_code to set
     */
    public void setEmp_code(String emp_code)
    {
        this.emp_code = emp_code;
    }

    /**
     * @return the bcode
     */
    public String getBcode()
    {
        return bcode;
    }

    /**
     * @param bcode the bcode to set
     */
    public void setBcode(String bcode)
    {
        this.bcode = bcode;
    }

    /**
     * @return the ename
     */
    public String getEname()
    {
        return ename;
    }

    /**
     * @param ename the ename to set
     */
    public void setEname(String ename)
    {
        this.ename = ename;
    }

    /**
     * @return the pass
     */
    public String getPass()
    {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass)
    {
        this.pass = pass;
    }


}
