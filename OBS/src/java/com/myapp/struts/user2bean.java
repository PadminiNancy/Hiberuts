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
public class user2bean extends org.apache.struts.action.ActionForm {
    
  private String uname;
  private int age;
  private String sex;
  private String address;
  private String phno;
    public user2bean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
  /*  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname() == null || getUname().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phno
     */
    public String getPhno() {
        return phno;
    }

    /**
     * @param phno the phno to set
     */
    public void setPhno(String phno) {
        this.phno = phno;
    }
     public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname() == null || getUname().length() < 1)
        {
            errors.add("uname", new ActionMessage("error.uname"));
            // TODO: add 'error.name.required' key to your resources
        }
        else if(getAge() == 0 || getAge() < 1)
        {
            errors.add("age", new ActionMessage("error.uage"));
        }

         else if(getPhno() == null || getPhno().length() < 10)
        {
            errors.add("phno", new ActionMessage("error.uphno"));
        }  
        return errors;
    }
}
