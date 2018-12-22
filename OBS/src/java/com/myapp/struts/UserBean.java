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
public class UserBean extends org.apache.struts.action.ActionForm {
    
    private String uname;
    private String acno;
    private String branch;
    private String ifc;

    

    /**
     * @return
     */

    /**
     *
     */
    public UserBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
/*    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
    {
        ActionErrors errors = new ActionErrors();
        if (getBranch() == null || getBranch().length() < 1)
        {
            errors.add("br_err", new ActionMessage("error.brr"));

        }
        else if(getUname() == null || getUname().length()<1)
        {
           errors.add("nm_err", new ActionMessage("error.nm"));

        }
        else if(getIfc() == null || getIfc().length()<1)
        {
           errors.add("pass_err", new ActionMessage("error.ifc"));

        }
        else if(getAcno() == null || getAcno().length()<1)
        {
            errors.add("act_err",new ActionMessage("error.acno"));
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
     * @return the ifc
     */
    public String getIfc() {
        return ifc;
    }

    /**
     * @param ifc the ifc to set
     */
    public void setIfc(String ifc) {
        this.ifc = ifc;
    }
    @Override
     public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname() == null || getUname().length() < 1) {
            errors.add("uname", new ActionMessage("error.uname."));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
