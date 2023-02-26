package com.github.yury1991.PayrollWeb.models;

// коэффициент оценки бизнес-процессов
public class BusinessCoefficient implements Coefficient {
	
	// флаг были ли ошибки
	private boolean isMistake;
	// флаг были ли незначительные ошибки	
	private int mistakeQuantity;
	// коэффициент ошибки штраф
	private float mistakeCoef;
	// количество незначительных ошибок	
	private float maxBusinessCoefficient;
	
	public BusinessCoefficient(float maxBusinessCoefficient) {
		this.maxBusinessCoefficient = maxBusinessCoefficient;
	}
	public BusinessCoefficient(boolean isMistake, int mistakeQuantity, float mistakeCoef) {
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
		return maxBusinessCoefficient;
	}
		public double getMistakeCoef() {
		return mistakeCoef;
	}
	public void setMistakeCoef(float mistakeCoef) {
		this.mistakeCoef = mistakeCoef;
	}	
			
	public float getMaxCoefficient() {		
	    return maxBusinessCoefficient;
	}
		

	@Override
	public float calculateCoefficient() {
		return (float) (maxBusinessCoefficient - (getMistakeQuantity() * getMistakeCoef()));
	}
		
}
