package com.github.yury1991.PayrollWeb.dao;

import org.springframework.stereotype.Component;

import com.github.yury1991.PayrollWeb.models.BusinessProfit;
import com.github.yury1991.PayrollWeb.models.EquipmentProfit;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

@Component
public class ProfitDAOImpl implements ProfitDAO {
	
	private SalesProfit salesProfit;

	@Override
	public SalesProfit getSalesProfit() {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public BusinessProfit getBusinessProfit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipmentProfit getEquipmentProfit() {
		// TODO Auto-generated method stub
		return null;
	} */

	@Override
	public void setSalesProfit(SalesProfit salesProfit) {
		this.salesProfit = salesProfit;
	}

/*	@Override
	public void setBusinessProfit(BusinessProfit businessProfit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEquipmentProfit(EquipmentProfit equipmentProfit) {
		// TODO Auto-generated method stub

	}*/

}
