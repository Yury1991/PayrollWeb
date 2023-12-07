package com.github.yury1991.PayrollWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.yury1991.PayrollWeb.dao.CoefficientDAO;
import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.Coefficient;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;



@Service
public class CoefficientServiceImpl implements CoefficientService {
	
	private final CoefficientDAO coefficientDAO;
	
	@Autowired
	public CoefficientServiceImpl(CoefficientDAO coefficientDAO) {
		this.coefficientDAO = coefficientDAO;
	}

	@Override
	public LoyaltyCoefficient getLoyaltyCoefficient() {
		return coefficientDAO.getLoyaltyCoefficient();
	}

	@Override
	public BusinessCoefficient getBusinessCoefficient() {
		return coefficientDAO.getBusinessCoefficient();
	}

	@Override
	public ParticipationCoefficient getParticipationCoefficient() {
		return coefficientDAO.getParticipationCoefficient();
	}

	@Override
	public void setLoyaltyCoefficient(LoyaltyCoefficient loyaltyCoefficient) {
		coefficientDAO.setLoyaltyCoefficient(loyaltyCoefficient);
		
	}

	@Override
	public void setBusinessCoefficient(BusinessCoefficient businessCoefficient) {
		coefficientDAO.setBusinessCoefficient(businessCoefficient);
		
	}

	@Override
	public void setParticipationCoefficient(ParticipationCoefficient participationCoefficient) {
		coefficientDAO.setParticipationCoefficient(participationCoefficient);
		
	}
	
	
}
