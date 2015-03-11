package com.josdem.refactoring;

import java.math.BigDecimal;

public class TransactionApplier {

	private AmountValidator amountValidator = new AmountValidator();

	public void subtractAmount(User user, BigDecimal amount) {
		amountValidator.hasFunds(user, amount);
		user.setBalance(user.getBalance().subtract(amount));
	}

}
