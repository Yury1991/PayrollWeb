package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public abstract class Profit {
	private Payment payment;
	public abstract BigDecimal calculateProfit();
	
	public Profit() {
		
	}	
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}	
}
