package com.josdem.refactoring;

import java.math.BigDecimal;

public class TransactionApplier {

	private AmountValidator amountValidator = new AmountValidator();

	public Boolean subtractAmount(User user, BigDecimal amount) {
		if(amountValidator.hasFunds(user, amount)){
			user.setBalance(user.getBalance().subtract(amount));
			return true;
		}
		return false;
	}

}
