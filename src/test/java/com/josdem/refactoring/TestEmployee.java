package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;

public class TestEmployee {
	
	@Test
	public void shouldGetEngineerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(100);
		Employee engineer = new Engineer();
		assertEquals(salary, engineer.getPaymentAmount());
	}
	
	@Test
	public void shouldGetSalesmanSalary() throws Exception {
		BigDecimal salary = new BigDecimal(110);
		Employee salesman = new Salesman();
		assertEquals(salary, salesman.getPaymentAmount());
	}
	
	@Test
	public void shouldGetManagerSalary() throws Exception {
		BigDecimal salary = new BigDecimal(120);
		Employee manager = new Manager();
		assertEquals(salary, manager.getPaymentAmount());
	}

}
