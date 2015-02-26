package com.josdem.refactoring;

import java.math.BigDecimal;

import com.josdem.bean.EmployeeType;

public class Manager implements Employee {
	
	private final BigDecimal bonus = new BigDecimal(20.00);
	
	public EmployeeType getType(){
		return EmployeeType.MANAGER;
	}
	
	public BigDecimal getPaymentAmount(){
		return monltySalary.add(bonus);
	}

}
