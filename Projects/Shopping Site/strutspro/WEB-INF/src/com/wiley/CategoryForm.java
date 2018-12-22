package com.wiley;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class CategoryForm extends ActionForm {
	protected String category_id;
	protected String category;
	public void setCategory_id(String category_id){
		this.category_id = category_id;
	}
	public String getCategory_id(){
		return category_id;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public String getCategory(){
		return category;		
	}
	public void reset(ActionMapping mapping, HttpServletRequest request){
		this.category_id = "";
		this.category = "";
	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		ActionErrors errors = new ActionErrors(); 
		if ( (category_id == null ) || (category_id.length() == 0) ){
			errors.add("category_id", new ActionError("errors.olns.category_id.required"));
		}
		if ( (category == null ) || (category.length() == 0) ) {
			errors.add("category", new ActionError("errors.olns.category.required"));
		}
		return errors;
	}
}