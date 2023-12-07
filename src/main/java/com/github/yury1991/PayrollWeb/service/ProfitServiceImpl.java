package com.github.yury1991.PayrollWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.yury1991.PayrollWeb.dao.ProfitDAO;
import com.github.yury1991.PayrollWeb.models.SalesProfit;

@Service
public class ProfitServiceImpl implements ProfitService {
	
	private final ProfitDAO profitDAO;
	
	@Autowired
	public ProfitServiceImpl(ProfitDAO profitDAO) {
		this.profitDAO = profitDAO;
	}

	@Override
	public SalesProfit getSalesProfit() {
		return profitDAO.getSalesProfit();
	}

	@Override
	public void setSalesProfit(SalesProfit salesProfit) {
		profitDAO.setSalesProfit(salesProfit);
	}

}
