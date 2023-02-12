package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

// коэффициент с продаж
public class SalesPercentage{
	// общая выручка за месяц
	private BigDecimal totalMonthProfit;
	// выручка за месяц за оборудование
	private BigDecimal equipmentMonthProfit;
	// план продаж
	private BigDecimal planMonthProfit;
		
	public SalesPercentage(BigDecimal totalMonthProfit, BigDecimal equipmentMonthProfit, BigDecimal planMonthProfit) {
		this.totalMonthProfit = totalMonthProfit;
		this.equipmentMonthProfit = equipmentMonthProfit;
		this.planMonthProfit = planMonthProfit;
	}
	
	public BigDecimal getTotalMonthProfit() {
		return totalMonthProfit;
	}
	public void setTotalMonthProfit(BigDecimal equipmentProfit) {
		this.totalMonthProfit = equipmentProfit;
	}
	public BigDecimal getEquipmentMonthProfit() {
		return equipmentMonthProfit;
	}
	public void setEquipmentMonthProfit(BigDecimal warehouseProfit) {
		this.equipmentMonthProfit = warehouseProfit;
	}
	public BigDecimal getPlan() {
		return planMonthProfit;
	}
	public void setPlan(BigDecimal plan) {
		this.planMonthProfit = plan;
	}	
	
	public BigDecimal getSalesPercentage() {
		return totalMonthProfit.multiply(equipmentMonthProfit).divide(planMonthProfit);
	}
	
	
}
