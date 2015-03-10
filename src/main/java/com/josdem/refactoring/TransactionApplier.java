package com.josdem.refactoring;

import java.math.BigDecimal;

public class TransactionApplier {

	private AmountValidator amountValidator = new AmountValidator();

	public void subtractAmount(User user, BigDecimal amount) {
		if(!amountValidator.hasFunds(user, amount)){
			throw new BusinessException();
		}
		user.setBalance(user.getBalance().subtract(amount));
	}

}
