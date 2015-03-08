package com.josdem.refactoring;

public class DiscountCalculator {
	
	public Double getTotal(Integer quantity, Integer itemPrice){
		Integer basePrice = quantity * itemPrice;
		
		Double discountFactor;
		if(basePrice > 1000){
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

}
