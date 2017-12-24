package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		
		assertTrue(transactionApplier.subtractAmount(user, amount));
		assertEquals(expectedBalance, user.getBalance());
	}
	
	@Test
	public void shouldNotSubtractAmountDueToNotSufficientFunds() {
		BigDecimal amount = new BigDecimal(200);

		User user = setUserExpectations();
		
		assertFalse(transactionApplier.subtractAmount(user, amount));
		assertEquals(userBalance, user.getBalance());
	}

	private User setUserExpectations() {
		User user = new User();
		user.setBalance(userBalance);
		return user;
	}

}
