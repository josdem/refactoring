package com.josdem.refactoring;

public class Range {
	
	private final Integer min;
	private final Integer max;

	public Range(Integer min, Integer max) {
		this.min = min;
		this.max = max;
	}
	
	public Integer getMin() {
		return min;
	}
	
	public Integer getMax() {
		return max;
	}
	
}
