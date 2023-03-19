package com.github.yury1991.PayrollWeb.service;

import java.util.List;

import com.github.yury1991.PayrollWeb.models.Coefficient;
import com.github.yury1991.PayrollWeb.models.ICoefficient;

public interface CoefficientService {
	public List<ICoefficient> getMaxCoefficients();
}
