package com.josdem.refactoring;

public class Entry {

	private Integer measure;
	private Double value;

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
