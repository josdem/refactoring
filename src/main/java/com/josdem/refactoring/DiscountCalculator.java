package com.josdem.refactoring;

public class DiscountCalculator {

	private Integer quantity;
	private Integer itemPrice;

	public Double getTotal(Integer quantity, Integer itemPrice){
		this.quantity = quantity;
		this.itemPrice = itemPrice;
		return getBasePrice() * getDiscountFactor();
	}

	private Integer getBasePrice() {
		return quantity * itemPrice;
	}
	
	private Double getDiscountFactor(){
		return getBasePrice() > 1000 ? 0.95 : 0.98;  
	}

}
