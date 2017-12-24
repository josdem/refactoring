package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class TestTransactionApplier {
	
	private TransactionApplier transactionApplier = new TransactionApplier();

	private BigDecimal userBalance = new BigDecimal(100);

	@Test
	public void shouldSubstractAmount() {
		BigDecimal amount = new BigDecimal(20);
		BigDecimal expectedBalance = new BigDecimal(80);
		
		User user = setUserExpectations();
		
		transactionApplier.subtractAmount(user, amount);
		assertEquals(expectedBalance, user.getBalance());
	}
	
	@Test (expected=BusinessException.class)
	public void shouldNotSubtractAmountDueToNotSufficientFunds() {
		BigDecimal amount = new BigDecimal(200);
		User user = setUserExpectations();
		
		transactionApplier.subtractAmount(user, amount);
		
		assertEquals(userBalance, user.getBalance());
	}

	private User setUserExpectations() {
		User user = new User();
		user.setBalance(userBalance);
		return user;
	}

}
