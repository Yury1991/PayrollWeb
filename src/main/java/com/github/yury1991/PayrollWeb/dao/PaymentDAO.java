package com.github.yury1991.PayrollWeb.dao;

import com.github.yury1991.PayrollWeb.models.Payment;

public interface PaymentDAO {	
	public Payment getPayments();	
	public void setPayments(Payment payment);
}
