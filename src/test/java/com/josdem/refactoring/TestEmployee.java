package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.josdem.bean.EmployeeType;

public class TestEmployee {
	
	private Employee employee = new Employee();
	
	@Test
	public void shouldGetEngineerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(100.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.ENGINEER));
	}
	
	@Test
	public void shouldGetSalesmanSalary() throws Exception {
		BigDecimal salary = new BigDecimal(110.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.SALESMAN));
	}
	
	@Test
	public void shouldGetManagerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(120.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.MANAGER));
	}

}
