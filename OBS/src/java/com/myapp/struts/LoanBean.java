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
public class LoanBean extends org.apache.struts.action.ActionForm {
    
   private String fname;
   private int age;
   private String sex;
   private String loan_type;
   private String grant;
   private String add;
   private String phno;
   private String email;

    public LoanBean() {
        super();
        // TODO Auto-generated constructor stub
    }

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
        if (getFname() == null || getFname().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.fname"));

        }
        else if(getSex() == null || getSex().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.sex"));

        }
        else if(getLoan_type() == null || getLoan_type().length()<1)
        {
           errors.add("pass_err", new ActionMessage("error.ltype"));

        }
        else if(getGrant() == null || getGrant().length()<1)
        {
            errors.add("act_err",new ActionMessage("error.grant"));
        }
        else if(getAdd() == null || getAdd().length()<1)
        {
            errors.add("bal_err",new ActionMessage("error.add"));
        }
        else if(getPhno() == null || getPhno().length()<1)
        {
            errors.add("ifc_err",new ActionMessage("error.ph"));
        }
        else if(getEmail() == null || getEmail().length()<1)
        {
            errors.add("dop_err",new ActionMessage("error.email"));
        }

        return errors;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
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
     * @return the loan_type
     */
    public String getLoan_type() {
        return loan_type;
    }

    /**
     * @param loan_type the loan_type to set
     */
    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    /**
     * @return the grant
     */
    public String getGrant() {
        return grant;
    }

    /**
     * @param grant the grant to set
     */
    public void setGrant(String grant) {
        this.grant = grant;
    }

    /**
     * @return the add
     */
    public String getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(String add) {
        this.add = add;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
