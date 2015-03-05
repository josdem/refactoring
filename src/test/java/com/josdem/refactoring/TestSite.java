package com.josdem.refactoring;

import static org.junit.Assert.*;

import org.junit.Test;

import com.josdem.refactoring.bean.PlanType;

public class TestSite {
	
	@Test
	public void shouldGetClientFromSite() throws Exception {
		Site site = new Site();
		assertNotNull(site.getClient());
	}
	
	@Test
	public void shouldGetAPlan() throws Exception {
		Site site = new Site();
		Customer customer = site.getClient();
		assertEquals(PlanType.BASIC, customer.getPlan());
	}

}
