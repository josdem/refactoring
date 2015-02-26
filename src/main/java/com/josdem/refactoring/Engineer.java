package com.josdem.refactoring;

import java.math.BigDecimal;

import com.josdem.bean.EmployeeType;

public class Engineer implements Employee {
	
	public EmployeeType getType(){
		return EmployeeType.ENGINEER;
	}
	
	public BigDecimal getPaymentAmount(){
		return monltySalary;
	}

}
