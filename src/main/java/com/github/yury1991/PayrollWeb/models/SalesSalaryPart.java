package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class SalesSalaryPart implements SalaryPart {
	
	private Payment payment;
	

	@Override
	public BigDecimal calculateSalaryPart() {
		// TODO Auto-generated method stub
		return null;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
