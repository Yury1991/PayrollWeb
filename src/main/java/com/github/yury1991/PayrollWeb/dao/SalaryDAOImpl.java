package com.github.yury1991.PayrollWeb.dao;

import java.math.BigDecimal;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.BusinessProfit;
import com.github.yury1991.PayrollWeb.models.EquipmentProfit;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;
import com.github.yury1991.PayrollWeb.models.Payment;
import com.github.yury1991.PayrollWeb.models.Salary;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

public class SalaryDAOImpl implements SalaryDAO {
	private Salary salary;
		
	@Override
	public BigDecimal getSalesSalaryPart() {
		return salary.getSalesSalaryPart();
	}

	@Override
	public void setSalesSalaryPart(BigDecimal salesSalaryPart) {
		salary.setSalesSalaryPart(salesSalaryPart) ;
	}


	@Override
	public BigDecimal calculateSalesSalaryPart(Payment payment, LoyaltyCoefficient loyaltyCoefficent,
			BusinessCoefficient businessCoefficient, ParticipationCoefficient participationCoefficient,
			SalesProfit salesProfit, BusinessProfit businessProfit, EquipmentProfit equipmentProfit) {
		// TODO Auto-generated method stub
		return null;
	}	
}
