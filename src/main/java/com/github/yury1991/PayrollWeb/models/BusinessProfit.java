package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class BusinessProfit extends Profit {
	
	//коэффициент оценки бизнес процессов
	private BusinessCoefficient businessCoefficient;
	
	// флаг были ли недочеты
	private boolean isDefect;
	
	// количество недочетов
	private short defectQuantity;
	
	// штраф за недочет
	private BigDecimal defectCost;
	
	
	public BusinessProfit(BusinessCoefficient businessCoefficient,
						  boolean isDefect, short defectQuantity, BigDecimal defectCost) {		
		this.businessCoefficient = businessCoefficient;
		this.defectQuantity = defectQuantity;
		this.defectCost = defectCost; 
	}
		
	public BigDecimal calculateProfit() {		
		if(isDefect == false) {
			return super.getPayment().getBusinessPayment().multiply(BigDecimal.valueOf(businessCoefficient.calculateCoefficient()));
		} else {
			return super.getPayment().getBusinessPayment().multiply(BigDecimal.valueOf(businessCoefficient.calculateCoefficient())).subtract(defectCost.multiply(BigDecimal.valueOf(defectQuantity)));
		}
		
	}
	
	public boolean isDefect() {
		return isDefect;
	}
	public void setDefect(boolean isDefect) {
		this.isDefect = isDefect;
	}
	
	public short getDefectQuantity() {		
			return defectQuantity;		
	}
	public void setDefectQuantity(short defectQuantity) {
		this.defectQuantity = defectQuantity;
	}
	
	public BigDecimal getDefectCost() {
		return defectCost;
	}
	public void setDefectCost(BigDecimal defectCost) {
		this.defectCost = defectCost;
	}
}
