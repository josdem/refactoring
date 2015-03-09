package com.josdem.refactoring;

import java.util.List;

public class Account {
	
	public Double getTotal(Integer min, Integer max, List<Entry> entries){
		Double result = 0.00;
		for (Entry entry : entries) {
			if(entry.getMeassure() >= min && entry.getMeassure() <= max){
				result += entry.getValue();
			}
		}
		return result;
	}

}
