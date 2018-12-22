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
 * @author dell
 */
public class AdminBean extends org.apache.struts.action.ActionForm
{

     private String admin_code;
     private String admin_name;
     private String pass;

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    

    /**
     * @return the bcode
     */
    public String getAdmin_code()
    {
        return admin_code;
    }

    /**
     * @param bcode the bcode to set
     */
    public void setAdmin_code(String admin_code)
    {
        this.admin_code = admin_code;
    }

    /**
     * @return the loc
     */
    public String getAdmin_name()
    {
        return admin_name;
    }

    /**
     * @param loc the loc to set
     */
    public void setAdmin_name(String admin_name)
    {
        this.admin_name = admin_name;
    }

    /**
     * @return the dist
     */
    public String getPass()
    {
        return pass;
    }

    /**
     * @param dist the dist to set
     */
    public void setPass(String pass)
    {
        this.pass = pass;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getAdmin_code() == null || getAdmin_code().length() < 1 || getPass() == null || getPass().length()<1) {
            errors.add("brn_err", new ActionMessage("error.bcode"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
    


}
