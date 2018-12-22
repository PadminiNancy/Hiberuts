package com.wiley;

public class Order {
	protected Long order_id;
	protected String contact_name;
	protected String delivery_address ;
	protected String cc_name ;
	protected String cc_number;
	protected String cc_expiry_date ;
	
	public void setorder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getorder_id() {
		return order_id;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setDelivery_address(String delivery_address){
		this.delivery_address = delivery_address;
	}
	public String getdelivery_address() {
		return delivery_address;
	}
	public void setCc_name(String cc_name){
		this.cc_name = cc_name;
	}
	public String getCc_name() {
		return cc_name;
	}
	public void setCc_number(String cc_number) {
		this.cc_number = cc_number;
	}
	public String getCc_number() {
		return cc_number;
	}
	public void setcc_expiry_date(String cc_expiry_date){
		this.cc_expiry_date = cc_expiry_date;
	}
	public String getcc_expiry_date() {
		return cc_expiry_date;
	}
}