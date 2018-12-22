package com.wiley;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class ShoppingItemForm extends ActionForm {
	protected String product_id;
	protected String name ;
	protected String description ;
	protected String price ;
	protected String quantity;
	protected String subtotal;
	
	public void setProduct_id(String product_id) {
		System.out.println("in setter...............quantity"+product_id);
		this.product_id = product_id;
	}
	public String getProduct_id(){
		return product_id;
	}	
	public void setName(String name){
		System.out.println("in setter...............name"+name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDescription(String description){
		System.out.println("in setter...............description"+description);
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setPrice(String price) {
		System.out.println("in setter...............price"+price);
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	public void setQuantity(String quantity) {
		System.out.println("in setter...............quantity"+quantity);
		this.quantity = quantity;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setSubtotal(String subtotal) {
		System.out.println("in setter...............subtotal"+subtotal);
		this.subtotal = subtotal;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.product_id = "";
		this.name = "";
		this.description = "";
		this.price = "";
		this.quantity = "";
		this.subtotal = "";
	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors(); 
		if ( (quantity == null ) || (quantity.length() == 0) ) {
			errors.add("quantity", new ActionError("errors.olns.quantity.required"));
		}
		if ( (price == null ) || (price.length() == 0) ) {
			errors.add("price", new ActionError("errors.olns.price.required"));
		}
		return errors;
	}
}