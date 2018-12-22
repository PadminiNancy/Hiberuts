/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Nancy
 */
public class AdLogin extends org.apache.struts.action.ActionForm implements java.io.Serializable{
    private String uname;
    private String pass;
     private Set aregisters = new HashSet(0);

    public AdLogin()
    {

    }

     public AdLogin(String uname)
    {
    this.uname = uname;
    }

      public AdLogin(String uname, String pass)
    {
    this.uname = uname;
    this.pass = pass;
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
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
