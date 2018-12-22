package com.wiley;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class ProductForm extends ActionForm {
	protected String product_id;
	protected String category_id;
	protected String name ;
	protected String description ;
	protected String price ;
	
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getCategory_id() {
		return category_id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.product_id = "";
		this.category_id = "";
		this.name = "";
		this.description = "";
		this.price = "";
	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		ActionErrors errors = new ActionErrors(); 
		if ( (category_id == null ) || (category_id.length() == 0) ) {
			errors.add("category_id", new ActionError("errors.olns.category_id.required"));
		}
		if ( (product_id == null ) || (product_id.length() == 0) ) {
			errors.add("product_id", new ActionError("errors.olns.product.required"));
		}
		if ( (price == null ) || (price.length() == 0) ) {
			errors.add("price", new ActionError("errors.olns.price.required"));
		}
		return errors;
	}
}