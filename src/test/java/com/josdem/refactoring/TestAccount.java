package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestAccount {

	private Account account = new Account();
	private List<Entry> entries = new ArrayList<Entry>();
	
	@Test
	public void shouldGetMeasureFromEntry() {
		Double expectedResult = 100.25;
		
		entries.add(new Entry(5, 100.25));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}
	
	@Test
	public void shouldGetMeasureTotalFromTwoEntries() {
		Double expectedResult = 150.25;
		
		entries.add(new Entry(5, 100.25));
		entries.add(new Entry(2, 50.00));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}
	
	@Test
	public void shouldGetZeroFromEntry() {
		Double expectedResult = 0.00;
		
		entries.add(new Entry(11, 100.25));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}

}
