package com.github.yury1991.PayrollWeb.service;

import java.math.BigDecimal;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.BusinessProfit;
import com.github.yury1991.PayrollWeb.models.EquipmentProfit;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;
import com.github.yury1991.PayrollWeb.models.Payment;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

public interface SalaryService {
	public BigDecimal getSalesSalaryPart();	
	public void setSalesSalaryPart(BigDecimal salesSalaryPart);
	public BigDecimal calculateSalesSalaryPart(Payment payment, LoyaltyCoefficient loyaltyCoefficent,
			BusinessCoefficient businessCoefficient, ParticipationCoefficient participationCoefficient,
			SalesProfit salesProfit, BusinessProfit businessProfit, EquipmentProfit equipmentProfit);
}
