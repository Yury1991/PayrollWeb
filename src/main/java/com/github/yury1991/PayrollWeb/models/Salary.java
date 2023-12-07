package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class Salary {
	
	private Payment payment;
	private LoyaltyCoefficient loyaltyCoefficent;
	private BusinessCoefficient businessCoefficient;
	private ParticipationCoefficient participationCoefficient;
	private SalesProfit salesProfit;
	private LoyaltyProfit loyaltyProfit;
	private BusinessProfit businessProfit;
	private EquipmentProfit equipmentProfit;
	private BigDecimal salesSalaryPart;
	private BigDecimal businessSalaryPart;
	private BigDecimal participationSalaryPart;
		
	public Salary() {
		
	}
	
	
/*	public Salary(	Payment payment,LoyaltyCoefficient loyaltyCoefficent,BusinessCoefficient businessCoefficient, ParticipationCoefficient participationCoefficient,
					SalesProfit salesProfit, BusinessProfit businessProfit, EquipmentProfit equipmentProfit) {
		this.payment = payment;
		this.loyaltyCoefficent = loyaltyCoefficent;
		this.businessCoefficient = businessCoefficient;
		this.participationCoefficient = participationCoefficient;
		this.salesProfit = salesProfit;
		this.businessProfit = businessProfit;
		this.equipmentProfit = equipmentProfit;		
	}
	
	public BigDecimal calculateSalesSalaryPart(Payment payment, LoyaltyCoefficient loyaltyCoefficent,BusinessCoefficient businessCoefficient, ParticipationCoefficient participationCoefficient,
					SalesProfit salesProfit, BusinessProfit businessProfit, EquipmentProfit equipmentProfit) {
		BigDecimal salesPercentage =  salesProfit.getTotalMonthRevenue().subtract(salesProfit.getEquipmentMonthRevenue()).divide(salesProfit.getSalesPlan());
		BigDecimal salesSalaryPart = payment.getSalesPayment().multiply(salesPercentage);
		return salesSalaryPart;
	}*/
	
	
// ------------	Методы доступа -----------------------
	
	public BigDecimal getSalesSalaryPart() {
		return salesSalaryPart;
	}

	public void setSalesSalaryPart(BigDecimal salesSalaryPart) {			
		this.salesSalaryPart = salesSalaryPart;		 
	}

/*	public BigDecimal getBusinessSalaryPart() {
		return businessSalaryPart;
	}

	public void setBusinessSalaryPart(BigDecimal businessSalaryPart) {
		this.businessSalaryPart = businessSalaryPart;
	}

	public BigDecimal getParticipationSalaryPart() {
		return participationSalaryPart;
	}

	public void setParticipationSalaryPart(BigDecimal participationSalaryPart) {
		this.participationSalaryPart = participationSalaryPart;
	}	
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public LoyaltyCoefficient getLoyaltyCoefficent() {
		return loyaltyCoefficent;
	}
	public void setLoyaltyCoefficent(LoyaltyCoefficient loyaltyCoefficent) {
		this.loyaltyCoefficent = loyaltyCoefficent;
	}
	public BusinessCoefficient getBusinessCoefficient() {
		return businessCoefficient;
	}
	public void setBusinessCoefficient(BusinessCoefficient businessCoefficient) {
		this.businessCoefficient = businessCoefficient;
	}
	public ParticipationCoefficient getParticipationCoefficient() {
		return participationCoefficient;
	}
	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient) {
		this.participationCoefficient = participationCoefficient;
	}
	public SalesProfit getSalesProfit() {
		return salesProfit;
	}
	public void setSalesProfit(SalesProfit salesProfit) {
		this.salesProfit = salesProfit;
	}
	public BusinessProfit getBusinessProfit() {
		return businessProfit;
	}
	public void setBusinessProfit(BusinessProfit businessProfit) {
		this.businessProfit = businessProfit;
	}
	public EquipmentProfit getEquipmentProfit() {
		return equipmentProfit;
	}
	public void setEquipmentProfit(EquipmentProfit equipmentProfit) {
		this.equipmentProfit = equipmentProfit;
	}*/

	
}
