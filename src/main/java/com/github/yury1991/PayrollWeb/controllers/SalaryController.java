package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.yury1991.PayrollWeb.models.Payment;
import com.github.yury1991.PayrollWeb.service.ManagerService;
import com.github.yury1991.PayrollWeb.service.ProfitService;
import com.github.yury1991.PayrollWeb.service.SalaryService;

@Controller
public class SalaryController {
	
	//private ProfitService profitService;
	private ManagerService managerService;
	
	@Autowired
	public SalaryController(ManagerService managerService) {		
		this.managerService = managerService;
	}
	
/*	@Autowired
	public SalaryController(ProfitService profitService, ManagerService managerService) {
		this.profitService = profitService;
		this.managerService = managerService;
	}*/
	
/*	@PostMapping("/api/managers/{id}/manager-calculate")
	public String setSalesData(Model model, @PathVariable("id") int id) {*/
	//	model.addAttribute("manager", managerService.getManager(id));
	//	model.addAttribute("salarySalesPart", salaryService.setSalesSalaryPart(null) ); 
/*		return "redirect:/api/managers/{id}/manager-calculate";
	}*/
	
/*	@GetMapping("/api/managers/{id}/manager-calculate")
	public String calculateSalesSalaryPart(@ModelAttribute("payment") Payment payment ) {
		return "redirect:/api/managers/{id}/manager-calculate";
	}*/
}
