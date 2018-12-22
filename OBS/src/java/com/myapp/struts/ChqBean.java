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
public class ChqBean extends org.apache.struts.action.ActionForm
{
     private String acno;
     private String req_id;
     private String req_date;
     private String uname;
   //  private String status;

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

    /**
     * @return the status
     */
   


     /* @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getBranch() == null || getBranch().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.br"));

        }
        else if(getUname()==null || getUname().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.nm"));

        }
        else if(getPass()==null || getPass().length()>6)
        {
           errors.add("pass_err", new ActionMessage("error.pass"));

        }


        return errors;
    } */



}
