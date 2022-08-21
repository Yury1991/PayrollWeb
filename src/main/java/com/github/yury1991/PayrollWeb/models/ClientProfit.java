package com.github.yury1991.PayrollWeb.models;

public class ClientProfit implements Profit {
	// зарплатная ставка за работу с клиентом
	private double clientPayment;
	//коэффициент лояльности клиента
	private ClientRate clientRate;
	
	
	public ClientProfit(double clientPayment, ClientRate clientRate) {
		this.clientPayment = clientPayment;
		this.clientRate = clientRate;
	}
	public double getClientPayment() {
		return clientPayment;
	}
	public void setClientPayment(double clientPayment) {
		this.clientPayment = clientPayment;
	}

	public double getProfit() {		
		return clientPayment * clientRate.getRate();
	}
}
