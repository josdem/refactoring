package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDiscountCalculator {
	
	private DiscountCalculator discountCalculator = new DiscountCalculator();

	@Test
	public void shouldGetMinDiscountFactor() throws Exception {
		Integer quantity = 10;
		Integer itemPrice = 5;
		Double expectedResult = 49.0;
		
		Double result = discountCalculator.getTotal(quantity, itemPrice);
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void shouldGetMaxDiscountFactor() throws Exception {
		Integer quantity = 250;
		Integer itemPrice = 5;
		Double expectedResult = 1187.5;
		
		Double result = discountCalculator.getTotal(quantity, itemPrice);
		
		assertEquals(expectedResult, result);
	}

}
