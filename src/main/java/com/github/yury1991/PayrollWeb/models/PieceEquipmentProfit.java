package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class PieceEquipmentProfit implements Profit {
	
	// общая прибыль от продаж
	private BigDecimal totalSalesProfit;
	// процент менеджера от продаж
	private float salesPercent;
	// коэффициент участия
	private ParticipationRate participationRate;
	
	public PieceEquipmentProfit(BigDecimal totalSalesProfit, float salesPercent, ParticipationRate participationRate) {
		this.totalSalesProfit = totalSalesProfit;
		this.salesPercent = salesPercent;
		this.participationRate = participationRate;
	}
		
	public BigDecimal getTotalSalesProfit() {
		return totalSalesProfit;
	}
	public void setTotalSalesProfit(BigDecimal totalSalesProfit) {
		this.totalSalesProfit = totalSalesProfit;
	}

	public PieceEquipmentProfit(ParticipationRate participationRate) {
		this.participationRate = participationRate;
	}
	public BigDecimal getProfit() {		
		return null;
		//return (totalSalesProfit.multiply(salesPercent  * participationRate.getRate()));
	}	
}
