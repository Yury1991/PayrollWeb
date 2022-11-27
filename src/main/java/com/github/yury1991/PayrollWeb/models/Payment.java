package com.github.yury1991.PayrollWeb.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Payment {	
	// зарплатная ставка с продаж
	@Value("${payment.property.salesPayment}")
	private String salesPayment;
	// зарплатная ставка от работы с клиента	
	@Value("${payment.property.clientPayment}")
	private String clientPayment;
	// зарплатная ставка за бизнесс-процессы	
	@Value("${payment.property.businessPayment}")
	private String businessPayment;
	// зарплатная ставка за работу на складе	
	@Value("${payment.property.stockPayment}")
	private  String stockPayment;	
	
	/* зарплатная ставка с продаж
		@Value("${payment.property.salesPayment}")
		private double salesPayment;
		// зарплатная ставка от работы с клиента	
		@Value("${payment.property.clientPayment}")
		private double clientPayment;
		// зарплатная ставка за бизнесс-процессы	
		@Value("${payment.property.businessPayment}")
		private double businessPayment;
		// зарплатная ставка за работу на складе	
		@Value("${payment.property.stockPayment}")
		private double stockPayment;	*/
	
	
	public Payment() {
		
	}
	
	@Override
	public String toString() {		
			return "Payment: " +  "Продажи " + getSalesPayment() +  " Клиент " +  getClientPayment()  + " Процесс " + getBusinessPayment() + " Склад " + getStockPayment();	
	}
	
	public String getSalesPayment() {
		return salesPayment;
	}

	public void setSalesPayment(String salesPayment) {
		this.salesPayment = salesPayment;
	}

	public String getClientPayment() {
		return clientPayment;
	}

	public void setClientPayment(String clientPayment) {
		this.clientPayment = clientPayment;
	}

	public String getBusinessPayment() {
		return businessPayment;
	}

	public void setBusinessPayment(String businessPayment) {
		this.businessPayment = businessPayment;
	}

	public String getStockPayment() {
		return stockPayment;
	}

	public void setStockPayment(String stockPayment) {
		this.stockPayment = stockPayment;
	}
	
	/*public double getSalesPayment() {
		return salesPayment;
	}
	public void setSalesPayment(double	 salesPayment) {
		this.salesPayment = salesPayment;
	}

	public double getClientPayment() {
		return clientPayment;
	}
	public void setClientPayment(double clientPayment) {
		this.clientPayment = clientPayment;
	}
	
	public double getBusinessPayment() {
		return businessPayment;
	}
	public void setBusinessPayment(double businessPayment) {
		this.businessPayment = businessPayment;
	}
	
	public double getStockPayment() {
		return stockPayment;
	}
	public void setStockPayment(double stockPayment) {
		this.stockPayment = stockPayment;
	}*/
}
