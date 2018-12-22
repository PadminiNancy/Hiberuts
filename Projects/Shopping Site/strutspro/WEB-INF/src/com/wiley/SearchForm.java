package com.wiley;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class SearchForm extends ActionForm {
	private String search_keyword = null;
	
	public String getsearch_keyword() {
		return (this.search_keyword);
	}
	public void setsearch_keyword(String search_keyword) {
		this.search_keyword = search_keyword;
	}
	// This method is called with every request. It resets the
	// Form attribute prior to setting the values in the new
	// request.
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.search_keyword = null;
	}
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if ( (search_keyword == null ) || (search_keyword.length() == 0) ) {
			errors.add("search_keyword", new ActionError("errors.olns_search_keyword.required"));
		}
		return errors;
	}
}