package com.josdem.refactoring;

import java.math.BigDecimal;

public class AmountValidator {

	public Boolean hasFunds(User user, BigDecimal amount) {
		return user.getBalance().compareTo(amount) >= 0;
	}

}
