package com.github.yury1991.PayrollWeb.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.yury1991.PayrollWeb.dao.SalaryDAO;
import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.BusinessProfit;
import com.github.yury1991.PayrollWeb.models.EquipmentProfit;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;
import com.github.yury1991.PayrollWeb.models.Payment;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

public class SalaryServiceImpl implements SalaryService {
	
	private SalaryDAO salaryDAO;
	
	@Autowired
	public SalaryServiceImpl(SalaryDAO salaryDAO) {
		this.salaryDAO = salaryDAO;
	}
	
	@Override
	public BigDecimal getSalesSalaryPart() {
		return salaryDAO.getSalesSalaryPart();
	}
	

	@Override
	public void setSalesSalaryPart(BigDecimal salesSalaryPart) {		
		 salaryDAO.setSalesSalaryPart(salesSalaryPart);
	}

	@Override
	public BigDecimal calculateSalesSalaryPart(Payment payment, LoyaltyCoefficient loyaltyCoefficent,
			BusinessCoefficient businessCoefficient, ParticipationCoefficient participationCoefficient,
			SalesProfit salesProfit, BusinessProfit businessProfit, EquipmentProfit equipmentProfit) {
		// TODO Auto-generated method stub
		return null;
	}



}
