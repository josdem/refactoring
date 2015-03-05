package com.josdem.refactoring;

import static org.junit.Assert.*;

import org.junit.Test;

import com.josdem.refactoring.bean.PlanType;

public class TestSite {
	
	@Test
	public void shouldGetBasicPlan() throws Exception {
		Site site = new Site();
		assertEquals(PlanType.BASIC, site.getPlan());
	}
	
	@Test
	public void shouldGetCustomPlan() throws Exception {
		Site site = new Site();
		Customer customer = new Customer();
		site.setCustomer(customer);
		assertEquals(PlanType.PLUS, site.getPlan());
	}

}
