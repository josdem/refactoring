package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class TestEmployee {
	
	@Test
	public void shouldGetEngineerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(100.00);
		Employee employee = new Engineer();
		assertEquals(salary, employee.getPaymentAmount());
	}
	
	@Test
	public void shouldGetSalesmanSalary() throws Exception {
		BigDecimal salary = new BigDecimal(110.00);
		Employee employee = new Salesman();
		assertEquals(salary, employee.getPaymentAmount());
	}
	
	@Test
	public void shouldGetManagerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(120.00);
		Employee employee = new Manager();
		assertEquals(salary, employee.getPaymentAmount());
	}

}
