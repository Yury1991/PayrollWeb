package com.github.yury1991.PayrollWeb.models;

// коэффициент лояльности клиента
public class ClientCoefficient implements Coefficient {
	// флаг были ли ли жалобы
	private boolean isComplaint;
	// количество жалоб
	private int complaintQuantity;
	// максимальное значение коэффициента лояльности 
	private  float maxClientCoefficient;
	// значение одно жалобы
	private  float complaintCoeffcient;	
	
	public ClientCoefficient() {
		
	}
	
	
	public ClientCoefficient(float maxClientCoefficient) {
		this.maxClientCoefficient = maxClientCoefficient;
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
		
	public float getMAX_CLIENT_COEFFICIENT() {
		return maxClientCoefficient;
	}

	public float getMaxCoefficient() {		
			return maxClientCoefficient;
	}

	@Override
	public float calculateCoefficient() {
		if(isComplaint == false) {
			return maxClientCoefficient;
		} else {
			return (float) (maxClientCoefficient - (complaintQuantity *
					complaintCoeffcient));
		}	
	}	
}
