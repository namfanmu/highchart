package com.stackInstance.HighChartDatabase.model;

public class CountList {
	
	private Long count;
	
	private int day;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public CountList(Long count, int day) {
		super();
		this.count = count;
		this.day = day;
	}

}
