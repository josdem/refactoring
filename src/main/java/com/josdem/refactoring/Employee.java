package com.josdem.refactoring;

import java.math.BigDecimal;

public interface Employee {
	
	final BigDecimal monthlySalary = new BigDecimal(100);
	BigDecimal getPaymentAmount();

}
