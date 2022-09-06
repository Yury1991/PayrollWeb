package com.github.yury1991.PayrollWeb.models;

// коэффициент участия в сделке
public class ParticipationRate implements Rate {
	// поиск клиента
	private double findClientCoef;
	// принятие позитивного решения
	private double positiveDecisionCoef;
	// ведение документацию
	private double documentationCoef;
	// ведение переговоров
	private double discussionCoef;
	// сопровождение сделки
	private double maintenanceShipmentCoef;
	// максимальное значение коэффициента участия
	private final double MAX_PARTICIPATION_RATE = 1;
	// минимальное значение коэффициента участия
	private final double MIN_PARTICIPATION_RATE = 0.2;
	
	private boolean isFindClient;
	// принятие позитивного решения
	private boolean isPositiveDecision;
	// ведение документацию
	private boolean isDocumentation;
	// ведение переговоров
	private boolean isDiscussion;
	// сопровождение сделки
	private boolean isMaintenanceShipment;
	
	public ParticipationRate (boolean isFindClient, boolean isPositiveDecision, boolean isDocumentation, boolean isDiscussion,
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

	public void setFindClientCoef(double findClientCoef) {
		this.findClientCoef = findClientCoef;	
	}

	public double getPositiveDecisionCoef() {
		if(isPositiveDecision) {
			return 0.3;
		} else {
			return 0;
		}	
	}

	public void setPositiveDecisionCoef(double positiveDecisionCoef) {
		this.positiveDecisionCoef = positiveDecisionCoef;
	}

	public double getDocumentationCoef() {
		if(isDocumentation) {
			return 0.15;
		} else {
			return 0;
		}	
	}

	public void setDocumentationCoef(double documentationCoef) {
		this.documentationCoef = documentationCoef;
	}

	public double getDiscussionCoef() {
		if(isDiscussion) {
			return 0.15;
		} else {
			return 0;
		}	
	}

	public void setDiscussionCoef(double discussionCoef) {
		this.discussionCoef = discussionCoef;
	}

	public double getMaintenanceShipmentCoef() {
		if(isMaintenanceShipment) {
			return 0.1;
		} else {
			return 0;
		}
	}

	public void setMaintenanceShipmentCoef(double maintenanceShipmentCoef) {
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
	public double getRate() {
		return (MIN_PARTICIPATION_RATE + getFindClientCoef() + 
				getPositiveDecisionCoef() + getDiscussionCoef() + getDocumentationCoef() + getMaintenanceShipmentCoef());				
	}	
}
