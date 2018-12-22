package com.wiley;

public class Product {
	protected Long product_id;
	protected Long category_id;
	protected String name ;
	protected String description ;
	protected Double price ;
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public Long getCategory_id() {
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
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
}