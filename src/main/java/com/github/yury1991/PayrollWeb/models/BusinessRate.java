package com.github.yury1991.PayrollWeb.models;

public class BusinessRate implements Rate {
	private boolean isMistake;
	private boolean isSmallMistake;
	private short mistakeQuantity;
	private short smallMistakeQuantity;
	private final double BUSINESS_FULL_COEFFICIENT = 1.2 ;	
//	private final double MISTAKE_COEFFICIENT = 0.1;
	private final int SMALL_MISTAKE_PRICE = 300;	
	
	public boolean isMistake() {
		return isMistake;
	}
	public void setMistake(boolean isMistake) {
		this.isMistake = isMistake;
	}
	public boolean isSmallMistake() {
		return isSmallMistake;
	}
	public void setSmallMistake(boolean isSmallMistake) {
		this.isSmallMistake = isSmallMistake;
	}
	public short getMistakeQuantity() {
		if(isMistake == false) {
			mistakeQuantity = 0;
		} else {
			mistakeQuantity = 3;			
		}
		return mistakeQuantity;
	}
	public void setMistakeQuantity(short mistakeQuantity) {
		this.mistakeQuantity = mistakeQuantity;
	}
	public short getSmallMistakeQuantity() {
		if(isSmallMistake == false) {
			smallMistakeQuantity = 0;
		} else {
			smallMistakeQuantity = 3;			
		}
		return smallMistakeQuantity;
	}
	public void setSmallMistakeQuantity(short smallMistakeQuantity) {
		this.smallMistakeQuantity = smallMistakeQuantity;
	}
	public double getBusinessFullCoefficient() {
		return BUSINESS_FULL_COEFFICIENT;
	}
	
	public double calculatePenaltyCost() {
		return (smallMistakeQuantity * SMALL_MISTAKE_PRICE);
	}
	
	public double getRate() {
		//return (double) (BUSSINESS_FULL_COEFFICIENT - (mistakeQuantity * MISTAKE_COEFFICIENT));
		return BUSINESS_FULL_COEFFICIENT;
	}	
}
