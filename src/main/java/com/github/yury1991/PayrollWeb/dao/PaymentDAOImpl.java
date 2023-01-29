package com.github.yury1991.PayrollWeb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.github.yury1991.PayrollWeb.models.Payment;

@Component
public class PaymentDAOImpl implements PaymentDAO{	
	
	
	@Override
	public Payment getPayment() {		
		return new Payment() ;
	}

	@Override
	public void updateManager(Payment payment) {
		
		
	}	
}