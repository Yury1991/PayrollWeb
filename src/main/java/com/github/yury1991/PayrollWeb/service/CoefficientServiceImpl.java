package com.github.yury1991.PayrollWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.yury1991.PayrollWeb.dao.CoefficientDAO;
import com.github.yury1991.PayrollWeb.models.Coefficient;
import com.github.yury1991.PayrollWeb.models.ICoefficient;

@Service
public class CoefficientServiceImpl implements CoefficientService {
	
	@Autowired
	CoefficientDAO coefficientDAO;
	
	@Override
	public List<ICoefficient> getMaxCoefficients() {
		return coefficientDAO.getMaxCoefficients();
	}
}
