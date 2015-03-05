package com.josdem.refactoring;

import com.josdem.refactoring.bean.PlanType;

public class Site {

	private Customer customer;

	public PlanType getPlan() {
		return customer == null ? PlanType.BASIC : PlanType.PLUS;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
