package com.josdem.refactoring;

public class ParkingLot {

	private static final Integer MAX_CAPACITY = 5;
	private Integer cars = 0;

	public Boolean isEmpty() {
		return cars == 0;
	}

	public void park(){
		if(isFull()){
			throw new RuntimeException("Cars Capacity Exceeded");
		}
		cars++;
	}

	public Boolean isFull() {
		return cars >= MAX_CAPACITY;
	}

}
