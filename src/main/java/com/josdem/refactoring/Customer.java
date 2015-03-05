package com.josdem.refactoring;

import com.josdem.refactoring.bean.PlanType;

public class Customer implements Nullable {

	public PlanType getPlan() {
		return PlanType.BASIC;
	}

	public Boolean isNull() {
		return true;
	}

}
