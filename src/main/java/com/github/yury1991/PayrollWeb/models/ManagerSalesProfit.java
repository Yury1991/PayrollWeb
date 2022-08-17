package com.github.yury1991.PayrollWeb.models;

//
public class ManagerSalesProfit implements ManagerProfit{
	private final short SALES_PERCENTAGE_PAYMENT = 10000;
	private SalesRate salesRate;
	
	public ManagerSalesProfit(SalesRate salesRate) {		
		this.salesRate = salesRate;
	}	

	public double getProfit() {		
		return SALES_PERCENTAGE_PAYMENT * salesRate.getRate();
	}

}
