package com.github.yury1991.PayrollWeb.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
			return new Payment(prop.getProperty("payment.salesPayment"),
					prop.getProperty("payment.clientPayment"), 
					prop.getProperty("payment.businessPayment"),
					prop.getProperty("payment.stockPayment")) ;
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		return null;		
	}	
}