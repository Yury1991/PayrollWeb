package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class SalesProfit implements Profit{
	
	//зарплатная ставка для продаж
	private BigDecimal salaryRate;
	// коэффициент с продаж
	private SalesPercentage salesPercentage;
	
	public SalesProfit(BigDecimal salaryRate, SalesPercentage salesPercentage) {		
		this.salaryRate = salaryRate;
		this.salesPercentage = salesPercentage;
	}	
	
	public BigDecimal getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(BigDecimal salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	public BigDecimal getProfit() {		
		return salaryRate.multiply(salesPercentage.getSalesPercentage());
	}
}
