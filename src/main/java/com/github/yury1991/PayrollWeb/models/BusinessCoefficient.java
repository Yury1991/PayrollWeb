package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

// коэффициент оценки бизнес-процессов
@Component
public class BusinessCoefficient implements ICoefficient {
	
	//максимальный коэффициент
	private float maxBusinessCoefficient;
	// флаг были ли ошибки
	private boolean isMistake;
    // количество ошибок
	private short mistakeQuantity;
	// коэффициент ошибки штраф
	private float mistakeValue;
	// флаг были ли недочеты
	private boolean isDefect;
	//количество недочетов
	private float defectQuantity;
	// сумму одной ошибки
	private float defectCost;
	
	
	public BusinessCoefficient() {
		maxBusinessCoefficient = 0;
		isMistake = false;
		mistakeQuantity = 0;
		mistakeValue = 0;
		isDefect = false;
		defectQuantity = 0;
		defectCost = 0;
	}	
	
	public BusinessCoefficient(float maxBusinessCoefficient) {
		this.maxBusinessCoefficient = maxBusinessCoefficient;
		isMistake = false;
		mistakeQuantity = 0;
		mistakeValue = 0;
		isDefect = false;
		defectQuantity = 0;
		defectCost = 0;
	}
	
	
	public boolean getIsMistake() {
		return isMistake;
	}
	public void setMistake(boolean isMistake) {
		this.isMistake = isMistake;
	}
	
	public short getMistakeQuantity() {			
			return 0;		
	}
	
	public void setMistakeQuantity(short mistakeQuantity) {
		this.mistakeQuantity = mistakeQuantity;
	}
	
	public float getMaxBusinessCoefficient() {
		return maxBusinessCoefficient;
	}
	public void setMaxBusinessCoefficient(float maxBusinessCoefficient) {
		this.maxBusinessCoefficient = maxBusinessCoefficient;
	}
	
	public float getMistakeValue() {
		return mistakeValue;
	}
	public void setMistakeValue(float mistakeValue) {
		this.mistakeValue = mistakeValue;
	}
	
	public boolean isDefect() {
		return isDefect;
	}

	public void setDefect(boolean isDefect) {
		this.isDefect = isDefect;
	}


	public float getDefectQuantity() {
		return defectQuantity;
	}


	public void setDefectQuantity(float defectQuantity) {
		this.defectQuantity = defectQuantity;
	}


	public float getDefectCost() {
		return defectCost;
	}


	public void setDefectCost(float defectCost) {
		this.defectCost = defectCost;
	}

	@Override
	public float getMaxCoefficient() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calculateCoefficient() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*	public float calculateCoefficient() {
		return (float) (maxBusinessCoefficient - (getMistakeQuantity() * getMistakeValue()));
	}*/
		
}
