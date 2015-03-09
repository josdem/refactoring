package com.josdem.refactoring;

import java.util.List;

public class Account {
	
	public Double getTotal(Range range, List<Entry> entries){
		Double result = 0.00;
		for (Entry entry : entries) {
			if(entry.getMeassure() >= range.getMin() && entry.getMeassure() <= range.getMax()){
				result += entry.getValue();
			}
		}
		return result;
	}

}
