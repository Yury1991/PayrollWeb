package com.github.yury1991.PayrollWeb.models;

public class BusinessProfit implements Profit {
	//зарплатная ставка за бизнес-процессы
	private double businessPayment;
	//Коэффициент оценки бизнес процессов
	private BusinessRate businessRate;
	// флаг были ли недочеты
	private boolean isDefect;
	// количество недочетов
	private int defectQuantity;
	// штраф за маленькую ошибку
	private int defectCost ;
	
	
	public BusinessProfit(double businessPayment, BusinessRate businessRate,
									boolean isDefect, int defectQuantity, int defectCost) {
		this.businessPayment = businessPayment;
		this.businessRate = businessRate;
		this.defectQuantity = defectQuantity;
		this.defectCost = defectCost; 
	}
		
	public double getBusinessPayment() {
		return businessPayment;
	}
	public void setBusinessPayment(double businessPayment) {
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
	
	public double getProfit() {		
		return ((businessPayment * businessRate.getRate()) -
				calculatePenaltyCost() );
	}

}
