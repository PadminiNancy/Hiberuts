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
public class Branch extends org.apache.struts.action.ActionForm {
    
    private String bcode;
    private String loc;
    private String dist;
    private String state;
    public Branch() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getBcode() == null || getBcode().length() < 1) {
            errors.add("branch_err", new ActionMessage("error.branch"));
            // TODO: add 'error.name.required' key to your resources
        }
        else if(getLoc() == null || getLoc().length()<1)
        {
           errors.add("loc_err", new ActionMessage("error.loc"));

        }
        else if(getDist() == null || getDist().length()>6)
        {
           errors.add("dist_err", new ActionMessage("error.dist"));

        }
        else if(getState() == null || getState().length()<1)
        {
            errors.add("state_err",new ActionMessage("error.state"));
        }

        return errors;
    }

    /**
     * @return the bcode
     */
    public String getBcode() {
        return bcode;
    }

    /**
     * @param bcode the bcode to set
     */
    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    /**
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * @return the dist
     */
    public String getDist() {
        return dist;
    }

    /**
     * @param dist the dist to set
     */
    public void setDist(String dist) {
        this.dist = dist;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
}
