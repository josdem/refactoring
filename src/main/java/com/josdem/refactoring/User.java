package com.josdem.refactoring;

import java.math.BigDecimal;

public class User {

	private BigDecimal balance;

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

}
