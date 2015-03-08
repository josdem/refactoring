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
		if(getBasePrice() > 1000){
			return 0.95;
		}
		return 0.98;
	}

}
