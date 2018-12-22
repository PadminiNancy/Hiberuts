package com.wiley;

import org.apache.struts.action.ActionMapping;

public class ApplicationActionMapping extends ActionMapping{

    protected boolean loginRequired;

    public ApplicationActionMapping(){
        loginRequired = false;
    }

    public void setLoginRequired(boolean flag){
        loginRequired = flag;
    }

    public boolean isLoginRequired(){
        return loginRequired;
    }
}