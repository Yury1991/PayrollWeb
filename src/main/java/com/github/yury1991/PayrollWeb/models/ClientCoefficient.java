package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

// коэффициент лояльности клиента
@Component
public class ClientCoefficient implements ICoefficient {
	
	// максимальное значение коэффициента лояльности 
	private float maxClientCoefficient;
	//макисмальный коэффициент
	private float complaintCoefficient;	
	// флаг были ли ли жалобы
	private boolean isComplaint;
	// количество жалоб
	private int complaintQuantity;
	// одна жалоба
	private float complaintValue;	
	
	public ClientCoefficient() {
		maxClientCoefficient = 0;
		complaintCoefficient = 0;
		isComplaint = false;
		complaintQuantity = 0;
		complaintValue = 0;		
	}	
	
	public ClientCoefficient(float maxClientCoefficient) {
		this.maxClientCoefficient = maxClientCoefficient;
		complaintCoefficient = 0;
		isComplaint = false;
		complaintQuantity = 0;
		complaintValue = 0;		
	}
	
	public boolean getIsComplaint() {
		return isComplaint;
	}
	
	public void setIsComplaint(boolean isComplaint) {
		this.isComplaint = isComplaint;
	}
	
	public float getComplaintQuantity() {
		return complaintQuantity;
	}
	
	public void setComplaintQuantity(short complaintQuantity) {
		this.complaintQuantity = complaintQuantity;
	}
		
	@Override
	public float getMaxCoefficient() {		
			return maxClientCoefficient;
	}
	
	public void setMaxCoefficient(float maxClientCoefficient) {
		this.maxClientCoefficient = maxClientCoefficient;
	}	
	
	@Override
	public float calculateCoefficient() {
		if(isComplaint == false) {
			return maxClientCoefficient;
		} else {
			return (float) (maxClientCoefficient - (complaintQuantity *
					complaintCoefficient));
		}	
	}

	public float getComplaintValue() {
		return complaintValue;
	}

	public void setComplaintValue(float complaintValue) {
		this.complaintValue = complaintValue;
	}	
}
