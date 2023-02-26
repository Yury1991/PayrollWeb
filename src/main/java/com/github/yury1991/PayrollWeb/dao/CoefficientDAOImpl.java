package com.github.yury1991.PayrollWeb.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.Coefficient;
import com.github.yury1991.PayrollWeb.models.Payment;

public class CoefficientDAOImpl implements CoefficientDAO{
	
	private float clientCoefficient;
	private float businessCoefficient;
	private float participationCoefficient;
	
	public void readMaxCoefficients() {
		Properties prop = new Properties();
		try(InputStream input = new FileInputStream("/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/coefficient.properties")) {			
			prop.load(input);			
			clientCoefficient = Float.valueOf(prop.getProperty("coefficient.clientCoefficient"));
			businessCoefficient = Float.valueOf(prop.getProperty("coefficient.businessCoefficient"));
			participationCoefficient = Float.valueOf(prop.getProperty("coefficient.participationCoefficient"));			
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}	
	}

	@Override
	public float getMaxCoefficient() {
			return 0;
	}

	public float getClientCoefficient() {
		return clientCoefficient;
	}

	public void setClientCoefficient(float clientCoefficient) {
		this.clientCoefficient = clientCoefficient;
	}

	public float getBusinessCoefficient() {
		return businessCoefficient;
	}

	public void setBusinessCoefficient(float businessCoefficient) {
		this.businessCoefficient = businessCoefficient;
	}

	public float getParticipationCoefficient() {
		return participationCoefficient;
	}

	public void setParticipationCoefficient(float participationCoefficient) {
		this.participationCoefficient = participationCoefficient;
	}

	@Override
	public float calculateCoeffcient() {
		// TODO Auto-generated method stub
		return 0;
	}

}
