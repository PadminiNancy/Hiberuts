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
public class ClBean extends org.apache.struts.action.ActionForm
{
     private String acno;
     private String act_type;
     private String dop;
     private String uname;
     private String pass;
     private double bal;
     private String bal_type;
     private String branch;
     private String ifc_code;

     @Override
     public void reset(ActionMapping mapping, HttpServletRequest request)
     {
         branch="R001";
         try
         {
              acno= new ClModel().getActNo(branch);
         }
         catch(Exception e)
         {
             System.out.print("Hello!My Name is Pallav");
         }
     }


     /**
     * @return the acno
     */
    public String getAcno()
    {
        return acno;
    }

    public void setAcno(String acno)
    {
        this.acno=acno;
    }


     /**
     * @return the act_type
     */
    public String getAct_type()
    {
        return act_type;
    }


    public void setAct_type(String act_type)
    {
        this.act_type=act_type;
    }


     /**
     * @return the dop
     */
    public String getDop()
    {
        return dop;
    }

    public void setDop(String dop)
    {
        this.dop=dop;
    }


    /**
     * @return the uname
     */
    public String getUname()
    {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname)
    {
        this.uname = uname;
    }

    /**
     * @return the pass
     */
    public String getPass()
    {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass)
    {
        this.pass = pass;
    }

    /**
     * @return the bal
     */
    public double getBal()
    {
        return bal;
    }

    /**
     * @param bal the bal to set
     */
    public void setBal(double bal)
    {
        this.bal = bal;
    }

    /**
     * @return the bal_type
     */
    public String getBal_type()
    {
        return bal_type;
    }

    /**
     * @param bal_type the bal_type to set
     */
    public void setBal_type(String bal_type)
    {
        this.bal_type = bal_type;
    }

    /**
     * @return the branch
     */
    public String getBranch()
    {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    /**
     * @return the ifc_code
     */
    public String getIfc_code()
    {
        return ifc_code;
    }

    /**
     * @param ifc_code the ifc_code to set
     */
    public void setIfc_code(String ifc_code)
    {
        this.ifc_code = ifc_code;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getBranch() == null || getBranch().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.br"));

        }
        else if(getUname() == null || getUname().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.nm"));

        }
        else if(getPass() == null || getPass().length()<1)
        {
           errors.add("pass_err", new ActionMessage("error.pass"));

        }
        else if(getAct_type() == null || getAct_type().length()<1)
        {
            errors.add("act_err",new ActionMessage("error.act"));
        }
        else if(getBal_type() == null || getBal_type().length()<1)
        {
            errors.add("bal_err",new ActionMessage("error.bal"));
        }
        else if(getIfc_code() == null || getIfc_code().length()<1)
        {
            errors.add("ifc_err",new ActionMessage("error.ifc"));
        }
        else if(getDop() == null || getDop().length()<1)
        {
            errors.add("dop_err",new ActionMessage("error.dop"));
        }
       
        return errors;
    }



}
