package com.github.yury1991.PayrollWeb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.yury1991.PayrollWeb.models.Manager;
import com.github.yury1991.PayrollWeb.service.ManagerService;

@Controller
public class ManagersController {	
	
	@Autowired
	private ManagerService managerService;
		
	// ------------------ Методы контроллера ---------------------------------
	@GetMapping("/api/managers")
	public String getAllManagers(Model model) {
		List<Manager> allManagers = managerService.getAllManagers();
		model.addAttribute("allManagers", allManagers);
		return "managers";
	}
	
	@GetMapping("/api/managers/{id}")
	public String getManager(Model model, @PathVariable("id") int id) {
		model.addAttribute("manager", managerService.getManager(id));
		return "manager-info";
	}
	
	@GetMapping("/api/managers/new")
	public String addNewManager(Model model) {	
		model.addAttribute("manager", new Manager());
		return "manager-create";
	}
	
	@PostMapping("/api/managers")
	public String saveManager(@ModelAttribute("manager") Manager manager) {			
		managerService.saveManager(manager);
		return "redirect:/api/managers";
	}	
	
	public String editManager(Model model, @PathVariable("id") int id) {
		model.addAttribute("manager", managerService.getManager(id));
		return "manager-edit";
	}	
	
	@PatchMapping("/api/managers/{id}")
	public String updateManager(@ModelAttribute("manager") Manager manager, @PathVariable("id") int id) {
		managerService.updateManager(manager, id);
		return "redirect:/api/managers";
	}	
	
	@DeleteMapping("/api/managers/{id}")
	public String deleteManager(@PathVariable("id") int id) {
		managerService.deleteManager(id);
		return "redirect:/api/managers";
	}	
}
