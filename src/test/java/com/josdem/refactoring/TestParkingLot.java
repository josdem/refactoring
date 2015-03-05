package com.josdem.refactoring;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.josdem.refactoring.exception.ParkingLotOverFlowException;

public class TestParkingLot {
	
	private static final int MAX_CAPACITY = 5;
	private ParkingLot parkingLot = new ParkingLot();
	
	@Test
	public void shouldKnowIfParkingLotIsEmpty() throws Exception {
		assertTrue(parkingLot.isEmpty());
	}
	
	@Test
	public void shouldPark() throws Exception {
		parkingLot.park();
		assertFalse(parkingLot.isEmpty());
	}
	
	@Test
	public void shouldFullAParkingLot() throws Exception {
		fullMyParkingLot();
	}

	@Test(expected=ParkingLotOverFlowException.class)
	public void shouldThrowAnExceptionSinceIsFullAndWantToPark() throws Exception {
		fullMyParkingLot();
		parkingLot.park();
	}
	
	private void fullMyParkingLot() throws ParkingLotOverFlowException {
		assertFalse(parkingLot.isFull());
		for(int i=0;i<MAX_CAPACITY;i++){
			parkingLot.park();
		}
		assertTrue(parkingLot.isFull());
	}
	

}
