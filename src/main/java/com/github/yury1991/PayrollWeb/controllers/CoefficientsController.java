package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.yury1991.PayrollWeb.models.ClientCoefficient;
import com.github.yury1991.PayrollWeb.service.CoefficientService;

@Controller
public class CoefficientsController {
	
	@Autowired
	private CoefficientService coefficientService;	
	
	@GetMapping("/api/settings/coefficients")
	public String getCoefficients(Model model) {
		ClientCoefficient clientCoefficient = (ClientCoefficient) coefficientService.getMaxCoefficients().get(0);
		model.addAttribute("clientCoefficient", clientCoefficient);	
		return "coefficients";
	}	
}
