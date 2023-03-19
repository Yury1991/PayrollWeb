package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.yury1991.PayrollWeb.service.PaymentService;

@Controller
public class PaymentsController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/api/settings/payments")
	public String getPayments(Model model) {		
		model.addAttribute("payment", paymentService.getPayment());
		return "payments";
	}
	
}
