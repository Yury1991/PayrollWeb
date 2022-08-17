package com.github.yury1991.PayrollWeb.models;

public class ManagerBusinessProfit implements ManagerProfit {
	private final short BUSSINESS_PAYMENT = 20000;
	private BusinessRate businessRate;	

	public ManagerBusinessProfit(BusinessRate businessRate) {
		this.businessRate = businessRate;
	}
	
	public double getProfit() {		
		return ((BUSSINESS_PAYMENT *businessRate.getRate()) -
				businessRate.calculatePenaltyCost() );
	}

}
