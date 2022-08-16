package com.github.yury1991.PayrollWeb.Logic;

public class ClientRate implements Rate {
	private boolean isComplaint;
	private double complaintQuantity;
	private final double FULL_CLIENT_COEFFICIENT = 1.2;
	private final double COMPLAINT_COEFFCIENT = 0.1;	
	
	public ClientRate () {
		 
	}
	
	public boolean isComplaint() {
		return isComplaint;
	}
	
	public void setComplaint(boolean isComplaint) {
		this.isComplaint = isComplaint;
	}
	public double getComplaintQuantity() {
		return complaintQuantity;
	}
	public void setComplaintQuantity(double complaintQuantity) {
		this.complaintQuantity = complaintQuantity;
	}
	
	public double getFULL_CLIENT_COEFFICIENT() {
		return FULL_CLIENT_COEFFICIENT;
	}

	public double getRate() {		
		return (FULL_CLIENT_COEFFICIENT - (complaintQuantity *
				COMPLAINT_COEFFCIENT));
	}	
}
