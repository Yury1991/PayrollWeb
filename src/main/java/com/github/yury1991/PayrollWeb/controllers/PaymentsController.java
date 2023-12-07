package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.github.yury1991.PayrollWeb.models.Payment;
import com.github.yury1991.PayrollWeb.service.PaymentService;

@Controller
public class PaymentsController {
	
	private final PaymentService paymentService;
	
	@Autowired
	public PaymentsController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@GetMapping("/api/settings/payments")
	public String getPayments(Model model) {		
		model.addAttribute("payment", paymentService.getPayments());
		return "payments";
	}
	
	@PostMapping("/api/settings/payments")
	public String setPayments(@ModelAttribute("payment") Payment payment) {
		paymentService.setPayments(payment);		
		return "redirect:/api/settings/payments";
	}
	
}
