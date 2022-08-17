package com.github.yury1991.PayrollWeb.models;

//Коэффициент участия в сделке
public class ParticipationRate implements Rate {
/*	private final double FIND_CLIENT_COEF = 0.3;
	private final double POSITIVE_DECISION_COEF = 0.3;
	private final double DOCUMENTATION_COEF = 0.15;
	private final double DISCUSSION_COEF = 0.15;
	private final double MAINTENANCE_SHIPMENT_COEF = 0.1;*/
	private final double FULL_PARTICIPATION_RATE = 1;	
	
	public double getRate() {		
		return FULL_PARTICIPATION_RATE ;
	}
	
	
	
	
}
