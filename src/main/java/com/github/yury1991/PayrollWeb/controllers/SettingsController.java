package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SettingsController {	
	
	@GetMapping("/api/settings")
	public String showSettings() {
		return "settings";
	}
	
	@GetMapping("/api/settings/coefficients")
	public String getCoefficients() {
		return "coefficients";
	}
	
}
