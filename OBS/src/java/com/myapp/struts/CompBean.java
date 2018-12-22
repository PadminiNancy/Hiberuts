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
public class CompBean extends org.apache.struts.action.ActionForm
{
     private String cid;
     private String cdate;
     private String ctext;
 //    private String cstatus;

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the cdate
     */
    public String getCdate() {
        return cdate;
    }

    /**
     * @param cdate the cdate to set
     */
    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    /**
     * @return the ctext
     */
    public String getCtext() {
        return ctext;
    }

    /**
     * @param ctext the ctext to set
     */
    public void setCtext(String ctext) {
        this.ctext = ctext;
    }

    /**
     * @return the cstatus
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
