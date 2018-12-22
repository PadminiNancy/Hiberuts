package com.wiley;

public class OrderDetail {
	protected Long order_id;
	protected Long order_dtl_id;
	protected Long order_qty ;
	protected Long product_id ;
	protected Double order_price;

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_dtl_id(Long order_dtl_id) {
		this.order_dtl_id = order_dtl_id;
	}
	public Long getOrder_dtl_id() {
		return order_dtl_id;
	}
	public void setOrder_qty(Long order_qty){
		this.order_qty = order_qty;
	}
	public Long getOrder_qty() {
		return order_qty;
	}
	public void setProduct_id(Long product_id){
		this.product_id = product_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setOrder_price(Double order_price) {
		this.order_price = order_price;
	}
	public Double getOrder_price() {
		return order_price;
	}
}