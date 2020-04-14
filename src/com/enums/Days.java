package com.enums;

public enum Days {
	SUNDAY(1),MONDAY(2),THUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	
	public int day;
	Days(int day){
		this.day = day;
	}
	public int getValue() {	
		return day;
	}
}
