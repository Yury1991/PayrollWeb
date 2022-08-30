package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

	@GetMapping("/api")
	public String start() {
		return "start";
	}
	
	@GetMapping("/api/managers")
	public String showManagers() {
		return "managers";
	}
}
