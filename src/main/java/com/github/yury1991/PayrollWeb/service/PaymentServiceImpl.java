package com.github.yury1991.PayrollWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.yury1991.PayrollWeb.dao.PaymentDAO;
import com.github.yury1991.PayrollWeb.models.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	private final PaymentDAO paymentDAO;
	
	@Autowired
	public PaymentServiceImpl(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}	

	@Override
	public Payment getPayments() {		
		return paymentDAO.getPayments();
	}

	@Override
	public void setPayments(Payment payment) {
		paymentDAO.setPayments(payment);
		
	}
}
