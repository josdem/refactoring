package com.josdem.refactoring;

import java.math.BigDecimal;

public class Manager implements Employee {
	
	private BigDecimal bonus = new BigDecimal(20);

	public BigDecimal getPaymentAmount() {
		return monthlySalary.add(bonus);
	}

}
