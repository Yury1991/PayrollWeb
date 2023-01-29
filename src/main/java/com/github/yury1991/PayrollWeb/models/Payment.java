package com.github.yury1991.PayrollWeb.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:payment.properties")
public class Payment {	
	
	// зарплатная ставка с продаж	
		@Value("${payment.salesPayment}")
		private String salesPayment;
			
		// зарплатная ставка от работы с клиентом	
		@Value("${payment.clientPayment}")
		private String clientPayment;
			
		// зарплатная ставка за бизнесс-процессы
		@Value("${payment.businessPayment}")
		private String businessPayment;
			
		// зарплатная ставка за работу на складе	
		@Value("${payment.stockPayment}")
		private  String stockPayment;
	
	public Payment() {
		
	}
	
	@Autowired
	public Payment(String salesPayment, String  clientPayment, String  businessPayment, String  stockPayment) {
		this.salesPayment = salesPayment;
		this.clientPayment = clientPayment;
		this.businessPayment = businessPayment;
		this.stockPayment = stockPayment;
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
	/*
	public double getSalesPayment() {
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
