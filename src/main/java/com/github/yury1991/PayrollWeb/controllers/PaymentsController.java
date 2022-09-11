package com.github.yury1991.PayrollWeb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.yury1991.PayrollWeb.models.Payment;

@Controller
public class PaymentsController {
	
	
	@GetMapping("/api/settings/payments")
	public String getPayments(Model model) {		
		model.addAttribute("payment", new Payment());
		return "payments";
	}
	
}
