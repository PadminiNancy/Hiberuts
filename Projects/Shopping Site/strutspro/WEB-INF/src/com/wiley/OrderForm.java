package com.wiley;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

public class OrderForm extends ActionForm {
	protected String order_id;
	protected String contact_name ;
	protected String delivery_address ;
	protected String cc_name ;
	protected String cc_number;
	protected String cc_expiry_date;
	
	public void setOrder_id(String order_id) {
		System.out.println("in setter...............cc_number"+order_id);
		this.order_id = order_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setContact_name(String contact_name){
		System.out.println("in setter...............contact_name"+contact_name);
		this.contact_name = contact_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setDelivery_address(String delivery_address){
		System.out.println("in setter...............delivery_address"+delivery_address);
		this.delivery_address = delivery_address;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setCc_name(String cc_name) {
		System.out.println("in setter...............cc_name"+cc_name);
		this.cc_name = cc_name;
	}
	public String getCc_name() {
		return cc_name;
	}
	public void setCc_number(String cc_number) {
		System.out.println("in setter...............cc_number"+cc_number);
		this.cc_number = cc_number;
	}
	public String getCc_number() {
		return cc_number;
	}
	public void setCc_expiry_date(String cc_expiry_date) {
		System.out.println("in setter...............cc_expiry_date"+cc_expiry_date);
		this.cc_expiry_date = cc_expiry_date;
	}
	public String getCc_expiry_date() {
		return cc_expiry_date;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.order_id = "";
		this.contact_name = "";
		this.delivery_address = "";
		this.cc_name = "";
		this.cc_number = "";
		this.cc_expiry_date = "";
	}
	public ActionErrors validate(ActionMapping mapping
		, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors(); 
		if ( (cc_number == null ) || (cc_number.length() == 0) ) {
			errors.add("cc_number", new ActionError("errors.olns.cc_number.required"));
		}
		if ( (cc_name == null ) || (cc_name.length() == 0) ) {
			errors.add("cc_name", new ActionError("errors.olns.cc_name.required"));
		}
		return errors;
	}
}