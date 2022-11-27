package com.github.yury1991.PayrollWeb.dao;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.github.yury1991.PayrollWeb.models.Payment;

@Component
public class PaymentDAOImpl implements PaymentDAO{	
	
	private FileReader fileReader;
	private Properties properties;
	
	
	@Override
	public Payment getPayment() {			
		try {
			fileReader = new FileReader("src/main/resources/payment.properties");
			properties = new Properties();
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
				
		
		return new Payment() ;
	}	
}