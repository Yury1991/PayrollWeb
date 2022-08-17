package com.github.yury1991.PayrollWeb.models;

public class ManagerClientProfit implements ManagerProfit {
	private final short CLIENT_PAYMENT = 10000;
	private ClientRate clientRate;
	
	public ManagerClientProfit(ClientRate clientRate) {
		this.clientRate = clientRate;
	}

	public double getProfit() {		
		return CLIENT_PAYMENT * clientRate.getRate();
	}
}
