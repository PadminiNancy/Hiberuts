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
 * @author home
 */
public class TranBean extends org.apache.struts.action.ActionForm
{
     private String tr_id;
     private String tr_date;
     private String acno;
     private String parti;
     private String dr;
     private String cr;
     private String action;
     private String ref_num ;

    /**
     * @return the tr_id
     */
    public String getTr_id() {
        return tr_id;
    }

    /**
     * @param tr_id the tr_id to set
     */
    public void setTr_id(String tr_id) {
        this.tr_id = tr_id;
    }

    /**
     * @return the tr_date
     */
    public String getTr_date() {
        return tr_date;
    }

    /**
     * @param tr_date the tr_date to set
     */
    public void setTr_date(String tr_date) {
        this.tr_date = tr_date;
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
     * @return the parti
     */
    public String getParti() {
        return parti;
    }

    /**
     * @param parti the parti to set
     */
    public void setParti(String parti) {
        this.parti = parti;
    }

    /**
     * @return the dr
     */
    public String getDr() {
        return dr;
    }

    /**
     * @param dr the dr to set
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     * @return the cr
     */
    public String getCr() {
        return cr;
    }

    /**
     * @param cr the cr to set
     */
    public void setCr(String cr) {
        this.cr = cr;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the ref_num
     */
    public String getRef_num() {
        return ref_num;
    }

    /**
     * @param ref_num the ref_num to set
     */
    public void setRef_num(String ref_num) {
        this.ref_num = ref_num;
    }



      @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getTr_id() == null || getTr_id().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.trid"));

        }
        if (getTr_date() == null || getTr_date().length() < 1)
        {
            errors.add("br1_err", new ActionMessage("error.date"));

        }
        else if(getParti()==null || getParti().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.parti"));

        }
        else if(getDr()==null || getDr().length()<1)
        {
           errors.add("pass1_err", new ActionMessage("error.dr"));

        }
        else if(getCr()==null || getCr().length()<1)
        {
           errors.add("pass_err", new ActionMessage("error.cr"));

        }
        else if(getRef_num()==null || getRef_num().length()<1)
        {
           errors.add("pass2_err", new ActionMessage("error.ref"));

        }
        else if(getAction()==null || getAction().length()<1)
        {
           errors.add("pass3_err", new ActionMessage("error.action"));

        }
        else if(getAcno()==null || getAcno().length()<1)
        {
           errors.add("pass4_err", new ActionMessage("error.acno"));

        }


        return errors;
    }



}
