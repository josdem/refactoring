package com.josdem.refactoring;

import com.josdem.refactoring.exception.ParkingLotOverFlowException;

public class ParkingLot {
	private static final Integer MAX_CAPACITY = 5;
	private Integer cars = 0;

	public boolean isEmpty() {
		return cars == 0;
	}

	public void park() throws ParkingLotOverFlowException {
		if(cars==MAX_CAPACITY){
			throw new ParkingLotOverFlowException();
		}
		cars++;
	}

	public boolean isFull() {
		return cars >= MAX_CAPACITY;
	}
}
