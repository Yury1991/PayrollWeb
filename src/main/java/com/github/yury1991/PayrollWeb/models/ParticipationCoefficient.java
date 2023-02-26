package com.github.yury1991.PayrollWeb.models;

// коэффициент участия в сделке
public class ParticipationCoefficient implements Coefficient {
	// поиск клиента
	private float findClientCoef;
	// принятие позитивного решения
	private float positiveDecisionCoef;
	// ведение документацию
	private float documentationCoef;
	// ведение переговоров
	private float discussionCoef;
	// сопровождение сделки
	private float maintenanceShipmentCoef;
	// максимальное значение коэффициента участия
	private float maxParticipationCoefficient;
	// минимальное значение коэффициента участия
	private float minParticipationCoefficient;
	
	private boolean isFindClient;
	// принятие позитивного решения
	private boolean isPositiveDecision;
	// ведение документацию
	private boolean isDocumentation;
	// ведение переговоров
	private boolean isDiscussion;
	// сопровождение сделки
	private boolean isMaintenanceShipment;
	
	public ParticipationCoefficient (float maxParticipationCoefficient) {
		this.maxParticipationCoefficient = maxParticipationCoefficient;
	}
	
	public ParticipationCoefficient (boolean isFindClient, boolean isPositiveDecision, boolean isDocumentation, boolean isDiscussion,
								boolean isMaintenanceShipment) {
		this.isFindClient = isFindClient;		
		this.isPositiveDecision = isPositiveDecision;	
		this.isDocumentation = isDocumentation;		
		this.isDiscussion = isDiscussion;	
		this.isMaintenanceShipment = isMaintenanceShipment;		
	}

	public double getFindClientCoef() {
		if(isFindClient) {
			return 0.3;
		} else {
			return 0;
		}
	}

	public void setFindClientCoef(float findClientCoef) {
		this.findClientCoef = findClientCoef;	
	}

	public float getPositiveDecisionCoef() {
		if(isPositiveDecision) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setPositiveDecisionCoef(float positiveDecisionCoef) {
		this.positiveDecisionCoef = positiveDecisionCoef;
	}

	public float getDocumentationCoef() {
		if(isDocumentation) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setDocumentationCoef(float documentationCoef) {
		this.documentationCoef = documentationCoef;
	}

	public float getDiscussionCoef() {
		if(isDiscussion) {
			return 0;
		} else {
			return 0;
		}	
	}

	public void setDiscussionCoef(float discussionCoef) {
		this.discussionCoef = discussionCoef;
	}

	public float getMaintenanceShipmentCoef() {
		if(isMaintenanceShipment) {
			return 0;
		} else {
			return 0;
		}
	}

	public void setMaintenanceShipmentCoef(float maintenanceShipmentCoef) {
		this.maintenanceShipmentCoef = maintenanceShipmentCoef;
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
	
	@Override
	public float getMaxCoefficient() {
		return maxParticipationCoefficient;				
	}

	@Override
	public float calculateCoefficient() {
		return (float) (minParticipationCoefficient + getFindClientCoef() + 
				getPositiveDecisionCoef() + getDiscussionCoef() + getDocumentationCoef() + getMaintenanceShipmentCoef());
	}	
}
