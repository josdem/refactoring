package com.josdem.refactoring;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestParkingLot {
	
	private static final int MAX_CAPACITY = 5;

	private ParkingLot parkingLot = new ParkingLot();
	
	@Test
	public void shouldBeEmpty(){
		assertTrue(parkingLot.isEmpty());
	}
	
	@Test
	public void shouldPark(){
		parkingLot.park();
		assertFalse(parkingLot.isEmpty());
	}
	
	@Test
	public void shouldFullAParkingLot(){
		fillAndTestParkingLot();
	}

	@Test(expected=RuntimeException.class)
	public void shouldNotParkSinceIsFull(){
		fillAndTestParkingLot();
		parkingLot.park();
	}

	private void fillAndTestParkingLot(){
		for(int i=0; i<MAX_CAPACITY; i++){
			parkingLot.park();
		}
		assertTrue(parkingLot.isFull());
	}
	
}