package com.wiley;
public class ShoppingItem {
	protected Long product_id;
	protected String name ;
	protected String description ;
	protected Double price ;
	protected Long quantity;
	protected Double subtotal;
	
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getProduct_id() {
		return product_id;
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
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getSubtotal() {
		return subtotal;
	}
}