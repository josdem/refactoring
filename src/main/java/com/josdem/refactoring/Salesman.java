package com.josdem.refactoring;

import java.math.BigDecimal;

import com.josdem.bean.EmployeeType;

public class Salesman implements Employee {
	
	private final BigDecimal commission = new BigDecimal(10.00);
	
	public EmployeeType getType(){
		return EmployeeType.SALESMAN;
	}
	
	public BigDecimal getPaymentAmount(){
		return monltySalary.add(commission);
	}

}
