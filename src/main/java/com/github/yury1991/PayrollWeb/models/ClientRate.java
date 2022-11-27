package com.github.yury1991.PayrollWeb.models;

// коэффициент лояльности клиента
public class ClientRate implements Rate {
	// флаг были ли ли жалобы
	private boolean isComplaint;
	// количество жалоб
	private int complaintQuantity;
	// максимальное значение коэффициента лояльности 
	private final double MAX_CLIENT_COEFFICIENT = 1.2;
	// значение одно жалобы
	private final double COMPLAINT_COEFFICIENT = 0.1;	
	
	
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
	public double getComplaintQuantity() {
		return complaintQuantity;
	}
	public void setComplaintQuantity(short complaintQuantity) {
		this.complaintQuantity = complaintQuantity;
	}
		
	public double getMAX_CLIENT_COEFFICIENT() {
		return MAX_CLIENT_COEFFICIENT;
	}

	public double getRate() {		
		if(isComplaint == false) {
			return MAX_CLIENT_COEFFICIENT;
		} else {
			return (MAX_CLIENT_COEFFICIENT - (complaintQuantity *
					COMPLAINT_COEFFICIENT));
		}		
	}	
}
