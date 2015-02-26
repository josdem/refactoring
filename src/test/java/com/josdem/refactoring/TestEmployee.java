package com.josdem.refactoring;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.josdem.bean.EmployeeType;

public class TestEmployee {
	
	private Employee employee = new Employee();
	
	@Test
	public void shouldGetMontlySalary() throws Exception {
		BigDecimal monltyAmount = new BigDecimal(100.00);
		assertEquals(monltyAmount, employee.payAmount(EmployeeType.ENGINEER));
	}

}
