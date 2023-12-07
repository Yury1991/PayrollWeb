package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

// коэффициент участия в сделке
// класс имеет 5 пар - boolean - float, в будущем имеет смысл использовать Map
@Component
public class ParticipationCoefficient extends Coefficient{
	
	// флаг был ли осуществлен поиск клиента
	private boolean isClientSearch;
	// поиск клиента
	private float clientSearchCoefficient;
	
	// принятие позитивного решения
	private boolean isDecision;
	// принятие позитивного решения
	private float decisionCoefficient;
	
	// флаг было ли осуществлено ведение документацию
	private boolean isDocumentation;
	// ведение документации
	private float documentationCoefficient;
	
	// ведение переговоров
	private boolean isNegotiation;	
	// ведение переговоров
	private float negotiationCoefficient;
	
	// сопровождение сделки
	private boolean isShipment;
	// сопровождение сделки	
	private float shipmentCoefficient;
	
	
	public ParticipationCoefficient() {
		super(0f, 1.2f);		
	}
	
	public ParticipationCoefficient(float minCoefficient, float maxCoefficient) {
		super(minCoefficient, maxCoefficient);		
	}
	
	public ParticipationCoefficient (	float minCoefficient,
										float maxCoefficient,
										float clientSearchCoefficient,
										float decisionCoefficient,
										float documentationCoefficient,
										float negotiationCoefficient,
										float shipmentCoefficient) {
		super(minCoefficient, maxCoefficient);		
		this.setClientSearchCoefficient(clientSearchCoefficient);		
		this.setDecisionCoefficient(decisionCoefficient);
		this.setDocumentationCoefficient(documentationCoefficient);			
		this.setNegotiationCoefficient(negotiationCoefficient);		
		this.setShipmentCoefficient(shipmentCoefficient);				
	}
	
	public ParticipationCoefficient (float minCoefficient,
					float maxCoefficient,
					boolean isClientSearch,
					boolean isDecision,
					boolean isDocumentation,
					boolean isNegotiation,
					boolean isShipment) {
		super(minCoefficient, maxCoefficient);		
		this.isClientSearch = isClientSearch;
		this.isDecision = isDecision;
		this.isDocumentation = isDocumentation;
		this.isNegotiation = isNegotiation;
		this.isShipment = isShipment;				
	}

	@Override
	public float calculateCoefficient() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Методы доступа

	public float getClientSearchCoefficient() {
		return clientSearchCoefficient;
	}

	public void setClientSearchCoefficient(float clientSearchCoefficient) {
		this.clientSearchCoefficient = clientSearchCoefficient;
	}

	public boolean isClientSearch() {
		return isClientSearch;
	}

	public void setClientSearch(boolean isClientSearch) {
		this.isClientSearch = isClientSearch;
	}

	public float getDecisionCoefficient() {
		return decisionCoefficient;
	}

	public void setDecisionCoefficient(float decisionCoefficient) {
		this.decisionCoefficient = decisionCoefficient;
	}

	public boolean isDecision() {
		return isDecision;
	}

	public void setDecision(boolean isDecision) {
		this.isDecision = isDecision;
	}

	public float getDocumentationCoefficient() {
		return documentationCoefficient;
	}

	public void setDocumentationCoefficient(float documentationCoefficient) {
		this.documentationCoefficient = documentationCoefficient;
	}

	public boolean isDocumentation() {
		return isDocumentation;
	}

	public void setDocumentation(boolean isDocumentation) {
		this.isDocumentation = isDocumentation;
	}

	public float getNegotiationCoefficient() {
		return negotiationCoefficient;
	}

	public void setNegotiationCoefficient(float negotiationCoefficient) {
		this.negotiationCoefficient = negotiationCoefficient;
	}

	public boolean isNegotiation() {
		return isNegotiation;
	}

	public void setNegotiation(boolean isNegotiation) {
		this.isNegotiation = isNegotiation;
	}

	public float getShipmentCoefficient() {
		return shipmentCoefficient;
	}

	public void setShipmentCoefficient(float shipmentCoefficient) {
		this.shipmentCoefficient = shipmentCoefficient;
	}

	public boolean isShipment() {
		return isShipment;
	}

	public void setShipment(boolean isShipment) {
		this.isShipment = isShipment;
	}
	
}
