package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;


@Component
public class Payment {	
	
	// зарплатная ставка с продаж	
	private BigDecimal salesPayment;
			
	// зарплатная ставка от работы с клиентом	
	private BigDecimal loyaltyPayment;
			
	// зарплатная ставка за бизнесс-процессы
	private BigDecimal businessPayment;
			
	// зарплатная ставка за работу на складе	
	private BigDecimal stockPayment;
	
	public Payment() {
		
	}
	
	public Payment(BigDecimal salesPayment, BigDecimal  clientPayment, BigDecimal  businessPayment, BigDecimal stockPayment) {
		this.salesPayment = salesPayment;
		this.loyaltyPayment = clientPayment;
		this.businessPayment = businessPayment;
		this.stockPayment = stockPayment;
	}	

	public BigDecimal getSalesPayment() {
		return salesPayment;
	}

	public void setSalesPayment(BigDecimal salesPayment) {
		this.salesPayment = salesPayment;
	}

	public BigDecimal getLoyaltyPayment() {
		return loyaltyPayment;
	}

	public void setLoyaltyPayment(BigDecimal clientPayment) {
		this.loyaltyPayment = clientPayment;
	}

	public BigDecimal getBusinessPayment() {
		return businessPayment;
	}

	public void setBusinessPayment(BigDecimal businessPayment) {
		this.businessPayment = businessPayment;
	}

	public BigDecimal getStockPayment() {
		return stockPayment;
	}

	public void setStockPayment(BigDecimal stockPayment) {
		this.stockPayment = stockPayment;
	}
}
