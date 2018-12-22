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
 * @author RAKESH
 */
public class ChPassBean extends org.apache.struts.action.ActionForm {
private String acno;
private String pass;
private String np;

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
     * @return the pas
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pas the pas to set
     */
    public void setPass(String pas) {
        this.pass = pas;
    }

    /**
     * @return the np
     */
    public String getNp() {
        return np;
    }

    /**
     * @param np the np to set
     */
    public void setNp(String np) {
        this.np = np;
    }
}
