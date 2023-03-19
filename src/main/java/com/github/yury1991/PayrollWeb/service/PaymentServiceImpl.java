package com.github.yury1991.PayrollWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.yury1991.PayrollWeb.dao.PaymentDAO;
import com.github.yury1991.PayrollWeb.models.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentDAO paymentDAO;

	@Override
	public Payment getPayment() {		
		return paymentDAO.getPayment();
	}
}
