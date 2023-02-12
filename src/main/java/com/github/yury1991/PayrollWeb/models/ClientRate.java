package com.github.yury1991.PayrollWeb.models;

// коэффициент лояльности клиента
public class ClientRate implements Rate {
	// флаг были ли ли жалобы
	private boolean isComplaint;
	// количество жалоб
	private int complaintQuantity;
	// максимальное значение коэффициента лояльности 
	private  float MAX_CLIENT_COEFFICIENT;
	// значение одно жалобы
	private  float COMPLAINT_COEFFICIENT;	
	
	
	public ClientRate(boolean isComplaint, int complaintQuantity) {
		this.isComplaint = isComplaint;
		this.complaintQuantity = complaintQuantity;
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
		return MAX_CLIENT_COEFFICIENT;
	}

	public float getRate() {		
		if(isComplaint == false) {
			return MAX_CLIENT_COEFFICIENT;
		} else {
			return (float) (MAX_CLIENT_COEFFICIENT - (complaintQuantity *
					COMPLAINT_COEFFICIENT));
		}		
	}	
}
