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
public class NomBean extends org.apache.struts.action.ActionForm {


     private String nom_name;
     private String dob;
     private String rel;
     private String acno;


    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getAcno() == null || getAcno().length() < 1)
        {
            errors.add("holder_err", new ActionMessage("error.holder"));
            // TODO: add 'error.name.required' key to your resources
        }
        else if(getNom_name()== null || getNom_name().length()<1)
        {
            errors.add("nomi_err", new ActionMessage("error.nomi"));
        }
        else if(getDob()== null || getDob().length()<1)
        {
            errors.add("dobn_err", new ActionMessage("error.dobn"));
        }
        else if(getRel()== null || getRel().length()<1)
        {
            errors.add("rel_err", new ActionMessage("error.rel"));
        }
        return errors;
    }

    /**
     * @return the nom_name
     */
    public String getNom_name()
    {
        return nom_name;
    }

    /**
     * @param nom_name the nom_name to set
     */
    public void setNom_name(String nom_name)
    {
        this.nom_name = nom_name;
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
     * @return the rel
     */
    public String getRel()
    {
        return rel;
    }

    /**
     * @param rel the rel to set
     */
    public void setRel(String rel)
    {
        this.rel = rel;
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
