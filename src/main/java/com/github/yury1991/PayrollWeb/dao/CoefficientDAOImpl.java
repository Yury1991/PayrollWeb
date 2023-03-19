package com.github.yury1991.PayrollWeb.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.ClientCoefficient;
import com.github.yury1991.PayrollWeb.models.Coefficient;
import com.github.yury1991.PayrollWeb.models.ICoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;


@Component
public class CoefficientDAOImpl implements CoefficientDAO{
	
	private ClientCoefficient clientCoefficient;
	private BusinessCoefficient businessCoefficient;
	private ParticipationCoefficient participationCoefficient;
	private List<ICoefficient> coefficients = new ArrayList<>();
	
	@Override
	public List<ICoefficient> getMaxCoefficients() {
		Properties prop = new Properties();
		try(InputStream input = new FileInputStream("/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/coefficient.properties")) {			
			prop.load(input);			
			clientCoefficient = new ClientCoefficient(Float.valueOf(prop.getProperty("coefficient.clientCoefficient")));
			businessCoefficient = new BusinessCoefficient(Float.valueOf(prop.getProperty("coefficient.businessCoefficient")));
			participationCoefficient = new ParticipationCoefficient(Float.valueOf(prop.getProperty("coefficient.participationCoefficient")));	
			coefficients.add(clientCoefficient);
			coefficients.add(businessCoefficient);
			coefficients.add(participationCoefficient);
			return coefficients;
		} catch(IOException ex) {
			ex.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<ICoefficient> calculateCoefficients() {
		return null;
		
	}
}
