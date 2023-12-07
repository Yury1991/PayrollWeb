package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

// коэффициент оценки бизнес-процессов
@Component
public class BusinessCoefficient extends Coefficient {
	
	// флаг были ли ошибки
	private boolean isMistake;
	
    // количество ошибок
	private short mistakeQuantity;
	
	// коэффициент каждой ошибки штраф
	private float mistakeCoefficient;
	
	public BusinessCoefficient() {
		super(0f, 1.2f);
	}
	
	public BusinessCoefficient (float minCoefficient, float maxCoefficient) {
		super(minCoefficient, maxCoefficient);
	}
		
	
	public BusinessCoefficient (float minCoefficient, float maxCoefficient, 
							   	float mistakeCoefficient) {
		super(minCoefficient, maxCoefficient);
		this.mistakeCoefficient = mistakeCoefficient;
	}
	
	public BusinessCoefficient (float minCoefficient, float maxCoefficient, 
				   	boolean isMistake) {
		super(minCoefficient, maxCoefficient);
		this.isMistake = isMistake;
	}
	
	public BusinessCoefficient (float minCoefficient, float maxCoefficient, 
								boolean isMistake, float mistakeCoefficient) {
		super(minCoefficient, maxCoefficient);
		this.isMistake = isMistake;
		this.mistakeCoefficient = mistakeCoefficient;
	}
	
	public BusinessCoefficient (float minCoefficient, float maxCoefficient, 
					boolean isMistake, short mistakeQuantity,  float mistakeCoefficient) {
		super(minCoefficient, maxCoefficient);
		this.isMistake = isMistake;
		this.mistakeQuantity = mistakeQuantity;
		this.mistakeCoefficient = mistakeCoefficient;
	}
	
	@Override
	public float calculateCoefficient() {
		if(isMistake == false) {
			return getMaxCoefficient();
		} else {
			return (float) (getMaxCoefficient() - mistakeCoefficient*mistakeQuantity);
		}
		
		
	}	
	
	
	public boolean getIsMistake() {
		return isMistake;
	}
	public void setMistake(boolean isMistake) {
		this.isMistake = isMistake;
	}
	
		
	public short getMistakeQuantity() {			
			return mistakeQuantity;		
	}	
	public void setMistakeQuantity(short mistakeQuantity) {
		this.mistakeQuantity = mistakeQuantity;
	}	
	
	
	public float getMistakeCoefficient() {
		return mistakeCoefficient;
	}
	public void setMistakeCoefficient(float mistakeCoefficient) {
		this.mistakeCoefficient = mistakeCoefficient;
	}	
}
