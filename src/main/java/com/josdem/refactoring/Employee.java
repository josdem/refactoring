package com.josdem.refactoring;

import java.math.BigDecimal;

import com.josdem.bean.EmployeeType;

public class Employee {

	private final BigDecimal monltySalary = new BigDecimal(100.00);
	private final BigDecimal bonus = new BigDecimal(20.00);
	private final BigDecimal commission = new BigDecimal(10.00);

	public BigDecimal getPaymentAmount(EmployeeType type) {
		
		switch(type){
			case ENGINEER:
				return monltySalary;
			case SALESMAN:
				return monltySalary.add(commission);
			case MANAGER:
				return monltySalary.add(bonus);	
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}

}
