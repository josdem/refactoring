package com.josdem.refactoring;

public class Entry {

	private final Integer measure;
	private final Double value;

	public Entry(Integer measure, Double value) {
		this.measure = measure;
		this.value = value;
	}

	public Integer getMeassure() {
		return measure;
	}

	public Double getValue() {
		return value;
	}

}
