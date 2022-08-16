package com.github.yury1991.PayrollWeb.Logic;

public class TotalSalesProfit implements ManagerProfit {
	
	private final double TOTAL_SALES_PROFIT = 1000000;
	private final  double SALES_PERCENT = 0.1;
	private ParticipationRate participationRate;

	public TotalSalesProfit(ParticipationRate participationRate) {
		this.participationRate = participationRate;
	}
	public double getProfit() {		
		return (TOTAL_SALES_PROFIT * SALES_PERCENT * participationRate.getRate());
	}
}
