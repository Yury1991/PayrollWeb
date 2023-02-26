package com.github.yury1991.PayrollWeb.models;

import java.math.BigDecimal;

public class ClientProfit implements Profit {
	// зарплатная ставка за работу с клиентом
	private BigDecimal clientPayment;
	//коэффициент лояльности клиента
	private ClientCoefficient clientRate;
	
	
	public ClientProfit(BigDecimal clientPayment, ClientCoefficient clientRate) {
		this.clientPayment = clientPayment;
		this.clientRate = clientRate;
	}
	public BigDecimal getClientPayment() {
		return clientPayment;
	}
	public void setClientPayment(BigDecimal clientPayment) {
		this.clientPayment = clientPayment;
	}

	public BigDecimal getProfit() {		
		return null;
		//return clientPayment.multiply(clientPayment.getRate());
	}
}
