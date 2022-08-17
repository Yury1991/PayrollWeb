package com.github.yury1991.PayrollWeb.models;

public class SalesRate implements Rate{
	
	private double equipmentProfit;
	private double warehouseProfit;
	private double planProfit;
	
	
	public SalesRate(double equipmentProfit, double warehouseProfit, double planProfit) {
		this.equipmentProfit = equipmentProfit;
		this.warehouseProfit = warehouseProfit;
		this.planProfit = planProfit;
	}
	
	public double getEquipmentProfit() {
		return equipmentProfit;
	}
	public void setEquipmentProfit(double equipmentProfit) {
		this.equipmentProfit = equipmentProfit;
	}
	public double getWarehouseProfit() {
		return warehouseProfit;
	}
	public void setWarehouseProfit(double warehouseProfit) {
		this.warehouseProfit = warehouseProfit;
	}
	public double getPlan() {
		return planProfit;
	}
	public void setPlan(double plan) {
		this.planProfit = plan;
	}
	
	@Override
	public double getRate() {		
		return (equipmentProfit - warehouseProfit)/planProfit;
	}	
}
