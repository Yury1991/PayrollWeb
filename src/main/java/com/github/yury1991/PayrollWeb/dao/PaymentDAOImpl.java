package com.github.yury1991.PayrollWeb.dao;

import java.io.File;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;
import java.io.FileReader;
import java.io.FileWriter;

import org.springframework.stereotype.Component;

import com.github.yury1991.PayrollWeb.models.Payment;

@Component
public class PaymentDAOImpl implements PaymentDAO{	
	
	private final Properties prop = new Properties();
	private final String paymentPropertiesPath = "/home/yury/eclipse-workspace/Projects/PayrollWeb/src/main/resources/payment.properties";
	private File paymentProperties = new File(paymentPropertiesPath);
	private FileReader reader = null;
    private FileWriter writer = null;
    
	@Override
	public Payment getPayments() {
		try {
			reader = new FileReader(paymentProperties);
			prop.load(reader);
			return new Payment(	new BigDecimal(prop.getProperty("payment.salesPayment")),
								new BigDecimal(prop.getProperty("payment.loyaltyPayment")),
								new BigDecimal(prop.getProperty("payment.businessPayment")),
								new BigDecimal(prop.getProperty("payment.stockPayment")));			
			} catch(IOException ex) {
				ex.printStackTrace();
			}
			return null;		
		}
		
	@Override
	public void setPayments(Payment payment) {
		try {
			writer = new FileWriter(paymentProperties);
			prop.setProperty("payment.salesPayment", String.valueOf(payment.getSalesPayment()));
			prop.setProperty("payment.loyaltyPayment", String.valueOf(payment.getLoyaltyPayment()));
			prop.setProperty("payment.businessPayment", String.valueOf(payment.getBusinessPayment()));	
			prop.setProperty("payment.stockPayment", String.valueOf(payment.getStockPayment()));
			prop.store(writer, "Запись в файл");
			writer.close();
			writer.flush();
		} catch(IOException ex) {
			ex.printStackTrace();
		}		
	}
    
    
	
/*	@Override
	public Payment getPayments() {		
		try(InputStream input = new FileInputStream(paymentPropertiesPath)) {			
			prop.load(input);			
			return new Payment(Double.valueOf(prop.getProperty("payment.salesPayment")),
							   Double.valueOf(prop.getProperty("payment.clientPayment")),
							   Double.valueOf(prop.getProperty("payment.businessPayment")),
							   Double.valueOf(prop.getProperty("payment.stockPayment")));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		return null;		
	}

	@Override
	public void setPayments(Payment payment) {
		Properties prop = new Properties();
		try(FileOutputStream output = new FileOutputStream(paymentPropertiesPath)) {			
			prop.setProperty("payment.salesPayment", String.valueOf(payment.getSalesPayment()));
			prop.setProperty("payment.clientPayment", String.valueOf(payment.getClientPayment()));
			prop.setProperty("payment.businessPayment", String.valueOf(payment.getBusinessPayment()));	
			prop.setProperty("payment.stockPayment", String.valueOf(payment.getStockPayment()));
			prop.store(output, "Запись в файл");
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}		
	}	*/
}