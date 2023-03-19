package com.github.yury1991.PayrollWeb.dao;


import java.util.List;


import com.github.yury1991.PayrollWeb.models.ICoefficient;


public interface CoefficientDAO {
	public List<ICoefficient> getMaxCoefficients();
	public List<ICoefficient> calculateCoefficients();
}

