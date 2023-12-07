package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class LoyaltyProfit extends Profit {
	
//	private Payment payment;
	private LoyaltyCoefficient loyaltyCoefficient;	

	@Override
	public BigDecimal calculateProfit() {	
		return super.getPayment().getLoyaltyPayment().multiply(BigDecimal.valueOf(loyaltyCoefficient.calculateCoefficient()));
	}

	public LoyaltyCoefficient getLoyaltyCoefficient() {
		return loyaltyCoefficient;
	}

	public void setLoyaltyCoefficient(LoyaltyCoefficient loyaltyCoefficient) {
		this.loyaltyCoefficient = loyaltyCoefficient;
	}
}
