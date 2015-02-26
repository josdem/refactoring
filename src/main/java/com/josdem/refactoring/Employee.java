package com.josdem.refactoring;

import java.math.BigDecimal;

import com.josdem.bean.EmployeeType;

public interface Employee {

	final BigDecimal monltySalary = new BigDecimal(100.00);
	
	public EmployeeType getType();
	public BigDecimal getPaymentAmount();

}
