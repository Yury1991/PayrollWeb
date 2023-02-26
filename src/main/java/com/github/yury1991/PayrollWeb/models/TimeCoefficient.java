package com.github.yury1991.PayrollWeb.models;

public class TimeCoefficient implements Coefficient {
	private short calendarDays;	
	private short workingDays;	
	
	public TimeCoefficient(short workingDays, short calendarDays) {
		this.workingDays = workingDays;
		this.calendarDays = calendarDays;
	}
	
	public short getCalendarDays() {
		return calendarDays;
	}
	public void setCalendarDays(short calendarDays) {
		this.calendarDays = calendarDays;
	}
	public short getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(short workingDays) {
		this.workingDays = workingDays;
	}
	
	public float getMaxCoefficient() {		
		return 0;
	}
	

	@Override
	public float calculateCoefficient() {
		return (workingDays/calendarDays);
	}
}
