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
public class StopBean extends org.apache.struts.action.ActionForm
{
     private String sreq_id;
     private String sreq_date;
     private String acno;
     private String chqno;
    private int getChqno;
 //    private String status;

    /**
     * @return the sreq_id
     */
    public String getSreq_id() {
        return sreq_id;
    }

    /**
     * @param sreq_id the sreq_id to set
     */
    public void setSreq_id(String sreq_id)
    {
        this.sreq_id = sreq_id;
    }

    /**
     * @return the sreq_date
     */
    public String getSreq_date() {
        return sreq_date;
    }

    /**
     * @param sreq_date the sreq_date to set
     */
    public void setSreq_date(String sreq_date) {
        this.sreq_date = sreq_date;
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
     * @return the chqno
     */
    public String getChqno() {
        return chqno;
    }

    /**
     * @param chqno the chqno to set
     */
    public void setChqno(String chqno) {
        this.chqno = chqno;
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
