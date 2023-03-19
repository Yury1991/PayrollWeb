package com.github.yury1991.PayrollWeb.models;

import org.springframework.stereotype.Component;

// коэффициент участия в сделке
// класс имеет 5 пар - boolean - float, в будущем имеет смысл использовать Map
@Component
public class ParticipationCoefficient implements ICoefficient{
	
	// максимальное значение коэффициента участия
	private float maxParticipationCoefficient;	
	// поиск клиента
	private float findClientValue;
	// флаг был ли осуществлен поиск клиента
	private boolean isFindClient;
	// принятие позитивного решения
	private float positiveDecisionValue;
	// принятие позитивного решения
	private boolean isPositiveDecision;
	// ведение документации
	private float documentationValue;
	// флаг было ли осуществлено ведение документацию
	private boolean isDocumentation;
	// ведение переговоров
	private float discussionValue;
	// ведение переговоров
	private boolean isDiscussion;		
	// сопровождение сделки
	private float maintenanceShipmentValue;
	// сопровождение сделки
	private boolean isMaintenanceShipment;

	
	public ParticipationCoefficient () {
		maxParticipationCoefficient = 0;
		findClientValue = 0;
		isFindClient = false;
		positiveDecisionValue = 0;
		isPositiveDecision = false;
		documentationValue = 0;
		isDocumentation = false;
		discussionValue = 0;
		isDiscussion = false;
		maintenanceShipmentValue = 0;
		isMaintenanceShipment = false;		
	}
	
	public ParticipationCoefficient (float maxParticipationCoefficient) {
		this.maxParticipationCoefficient = maxParticipationCoefficient;
		findClientValue = 0;
		isFindClient = false;
		positiveDecisionValue = 0;
		isPositiveDecision = false;
		documentationValue = 0;
		isDocumentation = false;
		discussionValue = 0;
		isDiscussion = false;
		maintenanceShipmentValue = 0;
		isMaintenanceShipment = false;			
	}
	
	
	public double getFindClientValue() {
		if(isFindClient) {
			return 0.3;
		} else {
			return 0;
		}
	}

	public void setFindClientValue(float findClientValue) {
		this.findClientValue = findClientValue;	
	}

	public float getPositiveDecisionValue() {
		if(isPositiveDecision) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setPositiveDecisionValue(float positiveDecisionValue) {
		this.positiveDecisionValue = positiveDecisionValue;
	}

	public float getDocumentationValue() {
		if(isDocumentation) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setDocumentationValue(float documentationValue) {
		this.documentationValue = documentationValue;
	}

	public float getDiscussionValue() {
		if(isDiscussion) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setDiscussionValue(float discussionValue) {
		this.discussionValue = discussionValue;
	}

	public float getMaintenanceShipmentValue() {
		if(isMaintenanceShipment) {
			return 0;
		} else {
			return 0;
		}
	}

	public void setMaintenanceShipmentValue(float maintenanceShipmentValue) {
		this.maintenanceShipmentValue = maintenanceShipmentValue;
	}

	public boolean getIsFindClient() {
		return isFindClient;
	}
	
	public void setFindClient(boolean isFindClient) {
		this.isFindClient = isFindClient;
	}
	
	public boolean getIsPositiveDecision() {
		return isPositiveDecision;
	}

	public void setPositiveDecision(boolean isPositiveDecision) {
		this.isPositiveDecision = isPositiveDecision;
	}
	
	public boolean getIsDocumentation() {
		return isDocumentation;
	}
	
	public void setDocumentation(boolean isDocumentation) {
		this.isDocumentation = isDocumentation;
	}

	public boolean getIsDiscussion() {
		return isDiscussion;
	}

	public void setDiscussion(boolean isDiscussion) {
		this.isDiscussion = isDiscussion;
	}

	public boolean getIsMaintenanceShipment() {
		return isMaintenanceShipment;
	}

	public void setMaintenanceShipment(boolean isMaintenanceShipment) {
		this.isMaintenanceShipment = isMaintenanceShipment;
	}	

	
	public float calculateCoefficient() {
		return (float) (getFindClientValue() + 
				getPositiveDecisionValue() + getDiscussionValue() + getDocumentationValue() + getMaintenanceShipmentValue());
	}

	public void setMaxParticipationCoefficient(float maxParticipationCoefficient) {
		this.maxParticipationCoefficient = maxParticipationCoefficient;
	}

	@Override
	public float getMaxCoefficient() {
		// TODO Auto-generated method stub
		return maxParticipationCoefficient;
	}	
}
