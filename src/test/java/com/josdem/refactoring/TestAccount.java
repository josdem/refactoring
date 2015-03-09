package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestAccount {

	private Account account = new Account();
	
	@Test
	public void shouldGetMeasureFromEntry() throws Exception {
		Double expectedResult = 100.25;
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.add(new Entry(5, 100.25));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}
	
	@Test
	public void shouldGetMeasureTotalFromTwoEntries() throws Exception {
		Double expectedResult = 150.25;
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.add(new Entry(5, 100.25));
		entries.add(new Entry(2, 50.00));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}
	
	@Test
	public void shouldGetZeroFromEntry() throws Exception {
		Double expectedResult = 0.00;
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.add(new Entry(11, 100.25));
		
		assertEquals(expectedResult, account.getTotal(0, 10, entries));
	}

}
