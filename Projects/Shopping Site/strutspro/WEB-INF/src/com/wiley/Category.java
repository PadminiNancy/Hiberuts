package com.wiley;

public class Category {
	protected Long category_id;
	protected String category ;
	
	public void setCategory(String category){
		 this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public Long getCategory_id() {
		return category_id;
	}
}