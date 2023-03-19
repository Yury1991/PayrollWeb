package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

//Класс коэффициента, который содержит в себе всю информацию о коэффициентах
@Component
public class Coefficient {
			
	private ClientCoefficient clientCoefficient;
	private BusinessCoefficient businessCoefficient;
	private ParticipationCoefficient participationCoefficient;	
	
	
	public Coefficient() {
		
	}
	
	public Coefficient(ClientCoefficient clientCoefficient, BusinessCoefficient businessCoefficient, 
			ParticipationCoefficient participationCoefficient) {
		this.clientCoefficient = clientCoefficient;
		this.businessCoefficient = businessCoefficient;
		this.participationCoefficient = participationCoefficient;		
	}
	
	
	public ClientCoefficient getClientCoefficient() {
		return clientCoefficient;
	}


	public void setCientCoefficient(ClientCoefficient clientCoefficient) {
		this.clientCoefficient = clientCoefficient;
	}


	public BusinessCoefficient getBusinessCoefficient() {
		return businessCoefficient;
	}


	public void setBusinessCoefficient(BusinessCoefficient businessCoefficient) {
		this.businessCoefficient = businessCoefficient;
	}

	public ParticipationCoefficient getParticipationCoefficient() {
		return participationCoefficient;
	}


	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient) {
		this.participationCoefficient = participationCoefficient;
	}	
}
