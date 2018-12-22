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
public class FeedBean extends org.apache.struts.action.ActionForm {
    
   private String fid;
   private String fdate;
   private String ftext;

    /**
     *
     */
    public FeedBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
 /*   public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getFid() == null || getFid().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the fid
     */
    public String getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(String fid) {
        this.fid = fid;
    }

    /**
     * @return the fdate
     */
    public String getFdate() {
        return fdate;
    }

    /**
     * @param fdate the fdate to set
     */
    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    /**
     * @return the ftext
     */
    public String getFtext() {
        return ftext;
    }

    /**
     * @param ftext the ftext to set
     */
    public void setFtext(String ftext) {
        this.ftext = ftext;
    }
     public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getFtext() == null || getFtext().length() < 1) {
            errors.add("ftext", new ActionMessage("error.ftext"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
