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
public class enquiry extends org.apache.struts.action.ActionForm {
    

    private String from1;
    private String subject;
    private String enquiry;
    private String email;

    public enquiry() {
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
        if (getFrom1() == null || getFrom1().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the from1
     */
    public String getFrom1() {
        return from1;
    }

    /**
     * @param from1 the from1 to set
     */
    public void setFrom1(String from1) {
        this.from1 = from1;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the enquiry
     */
    public String getEnquiry() {
        return enquiry;
    }

    /**
     * @param enquiry the enquiry to set
     */
    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
