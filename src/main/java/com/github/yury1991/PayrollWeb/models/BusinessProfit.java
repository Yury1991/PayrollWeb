package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class BusinessProfit implements Profit {
	
	//зарплатная ставка за бизнес-процессы
	private BigDecimal businessPayment;
	//Коэффициент оценки бизнес процессов
	private BusinessCoefficient businessRate;
	// флаг были ли недочеты
	private boolean isDefect;
	// количество недочетов
	private int defectQuantity;
	// штраф за маленькую ошибку
	private int defectCost;
	
	
	public BusinessProfit(BigDecimal businessPayment, BusinessCoefficient businessRate,
									boolean isDefect, int defectQuantity, int defectCost) {
		this.businessPayment = businessPayment;
		this.businessRate = businessRate;
		this.defectQuantity = defectQuantity;
		this.defectCost = defectCost; 
	}
		
	public BigDecimal getBusinessPayment() {
		return businessPayment;
	}
	public void setBusinessPayment(BigDecimal businessPayment) {
		this.businessPayment = businessPayment;
	}		
	
	public boolean isDefect() {
		return isDefect;
	}
	public void setDefect(boolean isDefect) {
		this.isDefect = isDefect;
	}
	public int getDefectQuantity() {
		if(isDefect == false ) {
			return 0;
		} else {
			return defectQuantity;
		}
		
	}
	public void setDefectQuantity(int defectQuantity) {
		this.defectQuantity = defectQuantity;
	}
	
	public int getDefectCost() {
		return defectCost;
	}
	public void setDefectCost(int defectCost) {
		this.defectCost = defectCost;
	}
	
	public double calculatePenaltyCost() {
		return (defectQuantity * defectCost);
	}
	
	public BigDecimal getProfit() {		
		return null;
	}

}
