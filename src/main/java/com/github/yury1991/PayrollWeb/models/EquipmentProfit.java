package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class EquipmentProfit extends Profit {
	
	// прибыль с продажи единицы оборудования
	private BigDecimal unitEquipmentProfit;
	// процент менеджера от продаж
	private float managerSalesPercentage;
	// коэффициент участия
	private ParticipationCoefficient participationCoefficient;
	
	public EquipmentProfit(BigDecimal totalSalesProfit, float salesPercent, ParticipationCoefficient participationRate) {
		this.unitEquipmentProfit = totalSalesProfit;
		this.setManagerSalesPercentage(salesPercent);
		this.setParticipationCoefficient(participationRate);
	}
		
	public BigDecimal getTotalSalesProfit() {
		return unitEquipmentProfit;
	}
	public void setTotalSalesProfit(BigDecimal totalSalesProfit) {
		this.unitEquipmentProfit = totalSalesProfit;
	}

	public EquipmentProfit(ParticipationCoefficient participationRate) {
		this.setParticipationCoefficient(participationRate);
	}
	public BigDecimal calculateProfit() {		
		return unitEquipmentProfit.multiply(BigDecimal.valueOf(managerSalesPercentage)).multiply(BigDecimal.valueOf(participationCoefficient.calculateCoefficient()));
	}

	public float getManagerSalesPercentage() {
		return managerSalesPercentage;
	}

	public void setManagerSalesPercentage(float managerSalesPercentage) {
		this.managerSalesPercentage = managerSalesPercentage;
	}

	public ParticipationCoefficient getParticipationCoefficient() {
		return participationCoefficient;
	}

	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient) {
		this.participationCoefficient = participationCoefficient;
	}	
}
