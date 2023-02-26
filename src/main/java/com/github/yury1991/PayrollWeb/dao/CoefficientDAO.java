package com.github.yury1991.PayrollWeb.dao;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.Coefficient;

public interface CoefficientDAO {
	public float getMaxCoefficient();
	public float calculateCoeffcient();

}
