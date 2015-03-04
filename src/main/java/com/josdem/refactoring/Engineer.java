package com.josdem.refactoring;

import java.math.BigDecimal;

public class Engineer implements Employee {
	
	public BigDecimal getPaymentAmount() {
		return monthlySalary;
	}

}
