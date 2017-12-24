package com.josdem.refactoring;

import java.math.BigDecimal;

public class AmountValidator {

	public void hasFunds(User user, BigDecimal amount) {
		if(user.getBalance().compareTo(amount) < 0){
			throw new RuntimeException("No Sufficient Funds");
		}
	}

}
