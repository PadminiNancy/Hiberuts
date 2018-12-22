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
public class DraftBean extends org.apache.struts.action.ActionForm {
    
     private String acno;
     private String req_id;
     private String req_date;
     private String cheque_no;
     private String uname;

    public DraftBean() {
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
        if (getAcno() == null || getAcno().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the acno
     */
    public String getAcno() {
        return acno;
    }

    /**
     * @param acno the acno to set
     */
    public void setAcno(String acno) {
        this.acno = acno;
    }

    /**
     * @return the req_id
     */
    public String getReq_id() {
        return req_id;
    }

    /**
     * @param req_id the req_id to set
     */
    public void setReq_id(String req_id) {
        this.req_id = req_id;
    }

    /**
     * @return the req_date
     */
    public String getReq_date() {
        return req_date;
    }

    /**
     * @param req_date the req_date to set
     */
    public void setReq_date(String req_date) {
        this.req_date = req_date;
    }

    /**
     * @return the cheque_no
     */
    public String getCheque_no() {
        return cheque_no;
    }

    /**
     * @param cheque_no the cheque_no to set
     */
    public void setCheque_no(String cheque_no) {
        this.cheque_no = cheque_no;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }
}
