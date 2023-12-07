package com.github.yury1991.PayrollWeb.dao;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;

public interface CoefficientDAO {
	public LoyaltyCoefficient getLoyaltyCoefficient();
	public BusinessCoefficient getBusinessCoefficient();
	public ParticipationCoefficient getParticipationCoefficient();	
	public void setLoyaltyCoefficient(LoyaltyCoefficient loyaltyCoefficient);
	public void setBusinessCoefficient(BusinessCoefficient businessCoefficient);
	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient);
}
