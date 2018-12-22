package com.wiley;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class LoginForm extends ActionForm {
	private String password = null;
	private String username = null;
	// Password Accessors
	public String getPassword() {
		return (this.password);
	}
	public void setPassword(String password) {
		this.password = password;
	}
	// Username Accessors
	public String getUsername() {
		return (this.username);
	}
	public void setUsername(String username) {
		this.username = username;
	}
	// This method is called with every request. It resets the
	// Form attribute prior to setting the values in the new
	// request.
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.password = null;
		this.username = null;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if ( (username == null ) || (username.length() == 0) ) {
			errors.add("username", new ActionError("errors.username.required"));
		}
		if ( (password == null ) || (password.length() == 0) ) {
			errors.add("password", new ActionError("errors.password.required"));
		}
		return errors;
	}
}