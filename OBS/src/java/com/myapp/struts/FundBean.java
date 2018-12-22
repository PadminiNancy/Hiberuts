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
public class FundBean extends org.apache.struts.action.ActionForm
{
     private String treq_id;
     private String treq_date ;
     private String acno ;
     private Double trf_amt;
     private String toacno;
     private String bank ;
     private String branch ;
     private String ifc_code;
     private String verified_by ;
   

    /**
     * @return the treq_id
     */
    public String getTreq_id() {
        return treq_id;
    }

    /**
     * @param treq_id the treq_id to set
     */
    public void setTreq_id(String treq_id) {
        this.treq_id = treq_id;
    }

    /**
     * @return the treq_date
     */
    public String getTreq_date() {
        return treq_date;
    }

    /**
     * @param treq_date the treq_date to set
     */
    public void setTreq_date(String treq_date) {
        this.treq_date = treq_date;
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
     * @return the trf_amt
     */
    public Double getTrf_amt() {
        return trf_amt;
    }

    /**
     * @param trf_amt the trf_amt to set
     */
    public void setTrf_amt(Double trf_amt) {
        this.trf_amt = trf_amt;
    }

    /**
     * @return the toacno
     */
    public String getToacno() {
        return toacno;
    }

    /**
     * @param toacno the toacno to set
     */
    public void setToacno(String toacno) {
        this.toacno = toacno;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the ifc_code
     */
    public String getIfc_code() {
        return ifc_code;
    }

    /**
     * @param ifc_code the ifc_code to set
     */
    public void setIfc_code(String ifc_code) {
        this.ifc_code = ifc_code;
    }

    /**
     * @return the verified_by
     */
    public String getVerified_by() {
        return verified_by;
    }

    /**
     * @param verified_by the verified_by to set
     */
    public void setVerified_by(String verified_by) {
        this.verified_by = verified_by;
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
