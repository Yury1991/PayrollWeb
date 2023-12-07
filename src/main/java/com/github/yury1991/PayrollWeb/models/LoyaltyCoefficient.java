package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

@Component	
public class LoyaltyCoefficient extends Coefficient {
	
	// коэффициент жалобы
	private float complaintCoefficient;
	
	// флаг были ли жалобы
	private boolean isComplaint;
	
	// количество жалоб
	private short complaintQuantity;
		
	//Конструкторы ----------------------------
	
	public LoyaltyCoefficient() {
		super(0f, 1f);
		// TODO Auto-generated constructor stub
	}
	
	public LoyaltyCoefficient(	float minCoefficient, float maxCoefficient) {
		super(minCoefficient, maxCoefficient);
		// TODO Auto-generated constructor stub
	}
		
	public LoyaltyCoefficient(	float minCoefficient, float maxCoefficient, 
								float complaintCoefficient) {
		super(minCoefficient, maxCoefficient);
		this.complaintCoefficient = complaintCoefficient;
	}
	
	public LoyaltyCoefficient(	float minCoefficient, float maxCoefficient, 
								float complaintCoefficient, boolean isComplaint) {
		super(minCoefficient, maxCoefficient);
		this.complaintCoefficient = complaintCoefficient;
		this.isComplaint = isComplaint;
}
	
	public LoyaltyCoefficient(	float minCoefficient, float maxCoefficient, 
								float complaintCoefficient, boolean isComplaint,
								short complaintQuantity) {
		super(minCoefficient, maxCoefficient);
		this.complaintCoefficient = complaintCoefficient;
		this.isComplaint = isComplaint;
		this.complaintQuantity = complaintQuantity;
	}

	//Главные методы класса -----------------------
	@Override
	public float calculateCoefficient() {		
		if(isComplaint = false) {
			return super.getMaxCoefficient();
		} else {
			return (float) (super.getMaxCoefficient() - complaintCoefficient * complaintQuantity);
		}		
	}
	
	//Методы доступа ------------------------
	
	public float getComplaintCoefficient() {
		return complaintCoefficient;
	}
	public void setComplaintCoefficient(float complaint) {
		this.complaintCoefficient = complaint;
	}
	
	public boolean isComplaint() {
		return isComplaint;
	}

	public void setComplaint(boolean isComplaint) {
		this.isComplaint = isComplaint;
	}
	
	public short getComplaintQuantity() {
		return complaintQuantity;
	}
	public void setComplaintQuantity(short complaintQuantity) {
		this.complaintQuantity = complaintQuantity;
	}	
}
