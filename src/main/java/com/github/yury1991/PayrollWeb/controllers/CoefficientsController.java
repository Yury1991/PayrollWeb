package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.yury1991.PayrollWeb.models.BusinessCoefficient;
import com.github.yury1991.PayrollWeb.models.LoyaltyCoefficient;
import com.github.yury1991.PayrollWeb.models.ParticipationCoefficient;
import com.github.yury1991.PayrollWeb.service.CoefficientService;

@Controller
public class CoefficientsController {
	
	private final CoefficientService coefficientService;
	
	@Autowired
	public CoefficientsController(CoefficientService coefficientService) {
		this.coefficientService = coefficientService;
	}
	
	@GetMapping("/api/settings/coefficients")
	public String getCoefficents(Model model) {	
	
		LoyaltyCoefficient loyaltyCoefficient =  coefficientService.getLoyaltyCoefficient();
		BusinessCoefficient businessCoefficient = coefficientService.getBusinessCoefficient();
		ParticipationCoefficient participationCoefficient = coefficientService.getParticipationCoefficient();
		model.addAttribute("loyaltyCoefficient", loyaltyCoefficient);	
		model.addAttribute("businessCoefficient", businessCoefficient);
				model.addAttribute("participationCoefficient", participationCoefficient);
		return "coefficients";
	}	
	
	@PostMapping("/api/settings/coefficients")
	public String setCoefficients  (@ModelAttribute("loyaltyCoefficient") LoyaltyCoefficient loyaltyCoefficient,
									@ModelAttribute("businessCoefficient") BusinessCoefficient businessCoefficient,
									@ModelAttribute("participationCoefficient") ParticipationCoefficient participationCoefficient) {
		coefficientService.setLoyaltyCoefficient(loyaltyCoefficient);
		coefficientService.setBusinessCoefficient(businessCoefficient);
		coefficientService.setParticipationCoefficient(participationCoefficient);				
		return "redirect:/api/settings/coefficients";
	}
	
	
	
	
	

}
