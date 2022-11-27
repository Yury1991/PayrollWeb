package com.github.yury1991.PayrollWeb.models;

public class SalesProfit implements Profit{
	
	//зарплатная ставка для продаж
	private double salaryRate;
	// коэффициент с продаж
	private SalesRate salesRate;
	
	public SalesProfit(double salaryRate, SalesRate salesRate) {		
		this.salaryRate = salaryRate;
		this.salesRate = salesRate;
	}	
	
	public double getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	public double getProfit() {		
		return salaryRate * salesRate.getRate();
	}
}
