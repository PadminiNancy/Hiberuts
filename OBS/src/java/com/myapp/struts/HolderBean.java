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
public class HolderBean extends org.apache.struts.action.ActionForm
{

     private String hname;
     private String ph;
     private String adr;
     private String dob;
     private String idf;
     private String email;
     private String acno;

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getAcno() == null || getAcno().length() < 1)
        {
            errors.add("holder_err", new ActionMessage("error.holder"));
            // TODO: add 'error.name.required' key to your resources
        }
        else if(getHname() == null || getHname().length() < 1)
        {
            errors.add("hname_err", new ActionMessage("error.hname"));
        }
        else if(getPh() == null || getPh().length() < 1)
        {
            errors.add("ph_err", new ActionMessage("error.ph"));
        }
        else if(getAdr() == null || getAdr().length() < 1)
        {
            errors.add("adr_err", new ActionMessage("error.adr"));
        }
        else if(getDob() == null || getDob().length() < 1)
        {
            errors.add("dob_err", new ActionMessage("error.dob"));
        }
        else if(getEmail() == null || getEmail().length()<1)
        {
            errors.add("email_err",new ActionMessage("error.email"));
        }
        return errors;
    }

    /**
     * @return the hname
     */
    public String getHname()
    {
        return hname;
    }

    /**
     * @param hname the hname to set
     */
    public void setHname(String hname)
    {
        this.hname = hname;
    }

    /**
     * @return the ph
     */
    public String getPh()
    {
        return ph;
    }

    /**
     * @param ph the ph to set
     */
    public void setPh(String ph)
    {
        this.ph = ph;
    }

    /**
     * @return the adr
     */
    public String getAdr()
    {
        return adr;
    }

    /**
     * @param adr the adr to set
     */
    public void setAdr(String adr)
    {
        this.adr = adr;
    }

    /**
     * @return the dob
     */
    public String getDob()
    {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob)
    {
        this.dob = dob;
    }

    /**
     * @return the idf
     */
    public String getIdf()
    {
        return idf;
    }

    /**
     * @param idf the idf to set
     */
    public void setIdf(String idf)
    {
        this.idf = idf;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the acno
     */
    public String getAcno()
    {
        return acno;
    }

    /**
     * @param acno the acno to set
     */
    public void setAcno(String acno)
    {
        this.acno = acno;
    }
}
