package com.github.yury1991.PayrollWeb.models;

public class PieceEquipmentProfit implements Profit {
	
	// общая прибыль от продаж
	private double totalSalesProfit;
	// процент менеджера от продаж
	private double salesPercent = 0.1;
	// коэффициент участия
	private ParticipationRate participationRate;
	
	public PieceEquipmentProfit(double totalSalesProfit, double salesPercent, ParticipationRate participationRate) {
		this.totalSalesProfit = totalSalesProfit;
		this.salesPercent = salesPercent;
		this.participationRate = participationRate;
	}
		
	public double getTotalSalesProfit() {
		return totalSalesProfit;
	}
	public void setTotalSalesProfit(double totalSalesProfit) {
		this.totalSalesProfit = totalSalesProfit;
	}

	public PieceEquipmentProfit(ParticipationRate participationRate) {
		this.participationRate = participationRate;
	}
	public double getProfit() {		
		return (totalSalesProfit * salesPercent * participationRate.getRate());
	}	
}
