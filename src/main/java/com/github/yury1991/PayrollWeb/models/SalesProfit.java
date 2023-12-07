package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class SalesProfit extends Profit{
		
		// общая выручка за месяц
		private BigDecimal totalMonthRevenue;
		// выручка за месяц за оборудование
		private BigDecimal equipmentMonthRevenue;
		// план продаж
		private BigDecimal salesPlan;
		
		public SalesProfit() {
			
		}
		
		public SalesProfit(BigDecimal totalMonthProfit, BigDecimal equipmentMonthProfit, BigDecimal planMonthProfit) {
			this.totalMonthRevenue = totalMonthProfit;
			this.equipmentMonthRevenue = equipmentMonthProfit;
			this.salesPlan = planMonthProfit;
		}
				
		
		public BigDecimal calculateProfit() {
			BigDecimal salesPercentage = totalMonthRevenue.subtract(equipmentMonthRevenue).divide(salesPlan);
			return (super.getPayment().getSalesPayment().multiply(salesPercentage));
		}		
		
		
		public BigDecimal getTotalMonthRevenue() {
			return totalMonthRevenue;
		}
		public void setTotalMonthRevenue(BigDecimal equipmentProfit) {
			this.totalMonthRevenue = equipmentProfit;
		}
		
		public BigDecimal getEquipmentMonthRevenue() {
			return equipmentMonthRevenue;
		}
		public void setEquipmentMonthRevenue(BigDecimal equipmentMonthRevenue) {
			this.equipmentMonthRevenue = equipmentMonthRevenue;
		}
		
		public BigDecimal getSalesPlan() {
			return salesPlan;
		}
		public void setSalesPlan(BigDecimal plan) {
			this.salesPlan = plan;
		}				
}

	
