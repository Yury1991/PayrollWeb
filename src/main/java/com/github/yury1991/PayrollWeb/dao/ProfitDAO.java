package com.github.yury1991.PayrollWeb.dao;

import com.github.yury1991.PayrollWeb.models.BusinessProfit;
import com.github.yury1991.PayrollWeb.models.EquipmentProfit;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

public interface ProfitDAO {
	public SalesProfit getSalesProfit();
	/*public BusinessProfit getBusinessProfit();
	public EquipmentProfit getEquipmentProfit();*/
	public void setSalesProfit(SalesProfit salesProfit);
/*	public void setBusinessProfit(BusinessProfit businessProfit);
	public void setEquipmentProfit(EquipmentProfit equipmentProfit);*/
	
}
