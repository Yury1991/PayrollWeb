package com.github.yury1991.PayrollWeb.models;

// коэффициент оценки бизнес-процессов
public class BusinessRate implements Rate {
	
	// флаг были ли ошибки
	private boolean isMistake;
	// флаг были ли незначительные ошибки	
	private int mistakeQuantity;
	// коэффициент ошибки штраф
	private float mistakeCoef;
	// количество незначительных ошибок	
	private final double BUSINESS_FULL_COEFFICIENT = 1.2 ;

	public BusinessRate(boolean isMistake, int mistakeQuantity, float mistakeCoef) {
		this.isMistake = isMistake;		
		this.mistakeQuantity = mistakeQuantity;	
		this.mistakeCoef = mistakeCoef;
	}
	
	public boolean getIsMistake() {
		return isMistake;
	}
	public void setMistake(boolean isMistake) {
		this.isMistake = isMistake;
	}
	
	public int getMistakeQuantity() {	
		if(isMistake == false) {
			return 0;
		}
		else {
			return mistakeQuantity;
		}
	}
	public void setMistakeQuantity(short mistakeQuantity) {
		this.mistakeQuantity = mistakeQuantity;
	}
	
	public double getBusinessFullCoefficient() {
		return BUSINESS_FULL_COEFFICIENT;
	}
		public double getMistakeCoef() {
		return mistakeCoef;
	}
	public void setMistakeCoef(float mistakeCoef) {
		this.mistakeCoef = mistakeCoef;
	}	
			
	public float getRate() {		
		return (float) (BUSINESS_FULL_COEFFICIENT - (getMistakeQuantity() * getMistakeCoef()));
	}	
}
