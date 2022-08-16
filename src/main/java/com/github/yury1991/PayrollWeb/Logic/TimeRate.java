package com.github.yury1991.PayrollWeb.Logic;

public class TimeRate implements Rate {
	private short calendarDays;	
	private short workingDays;	
	
	public TimeRate(short workingDays, short calendarDays) {
		this.workingDays = workingDays;
		this.calendarDays = calendarDays;
	}
	
	public double getRate() {		
		return (workingDays/calendarDays);
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
}
