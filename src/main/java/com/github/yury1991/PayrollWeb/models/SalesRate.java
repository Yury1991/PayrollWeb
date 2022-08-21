package com.github.yury1991.PayrollWeb.models;

// коэффициент с продаж
public class SalesRate implements Rate{
	// общая выручка за месяц
	private double totalMonthProfit;
	// выручка за месяц за оборудование
	private double equipmentMonthProfit;
	// план продаж
	private double planMonthProfit;
		
	public SalesRate(double totalMonthProfit, double equipmentMonthProfit, double planMonthProfit) {
		this.totalMonthProfit = totalMonthProfit;
		this.equipmentMonthProfit = equipmentMonthProfit;
		this.planMonthProfit = planMonthProfit;
	}
	
	public double getTotalMonthProfit() {
		return totalMonthProfit;
	}
	public void setTotalMonthProfit(double equipmentProfit) {
		this.totalMonthProfit = equipmentProfit;
	}
	public double getEquipmentMonthProfit() {
		return equipmentMonthProfit;
	}
	public void setEquipmentMonthProfit(double warehouseProfit) {
		this.equipmentMonthProfit = warehouseProfit;
	}
	public double getPlan() {
		return planMonthProfit;
	}
	public void setPlan(double plan) {
		this.planMonthProfit = plan;
	}	
	
	public double getRate() {		
		return ((totalMonthProfit - equipmentMonthProfit)/planMonthProfit);
	}	
}
