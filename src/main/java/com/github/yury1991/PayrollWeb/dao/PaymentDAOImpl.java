package com.github.yury1991.PayrollWeb.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.github.yury1991.PayrollWeb.models.Payment;

@Component
public class PaymentDAOImpl implements PaymentDAO{	
	@Override
	public Payment getPayment() {		
		Properties prop = new Properties();
		try(InputStream input = new FileInputStream("/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/payment.properties")) {			
			prop.load(input);
			BigDecimal salesPayment = new BigDecimal(Double.valueOf(prop.getProperty("payment.salesPayment")));
			BigDecimal clientPayment = new BigDecimal(Double.valueOf(prop.getProperty("payment.clientPayment")));
			BigDecimal businessPayment = new BigDecimal(Double.valueOf(prop.getProperty("payment.businessPayment")));
			BigDecimal stockPayment = new BigDecimal(Double.valueOf(prop.getProperty("payment.stockPayment")));
			
			return new Payment(salesPayment, clientPayment, businessPayment, stockPayment);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		return null;		
	}	
}