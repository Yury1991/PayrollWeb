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


import com.github.yury1991.PayrollWeb.models.Manager;
import com.github.yury1991.PayrollWeb.models.SalesProfit;
import com.github.yury1991.PayrollWeb.service.ManagerService;

@Controller
public class ManagersController {	
	
	@Autowired
	private ManagerService managerService;
		
	// ------------------ Методы контроллера ---------------------------------
	//Возвращает список менеджеров
	@GetMapping("/api/managers")
	public String getAllManagers(Model model) {
		List<Manager> allManagers = managerService.getAllManagers();
		model.addAttribute("allManagers", allManagers);
		return "managers";
	}
	
	//Возвращает одного менеджера
	@GetMapping("/api/managers/{id}/manager-info")
	public String getManager(Model model, @PathVariable("id") int id) {
		model.addAttribute("manager", managerService.getManager(id));
		return "manager-info";
	}
	
	//Добавление нового менеджера
	@GetMapping("/api/managers/manager-create")
	public String addNewManager(Model model) {	
		model.addAttribute("manager", new Manager());
		return "manager-create";
	}
	
	//Сохранение нового менеджера
	@PostMapping("/api/managers")
	public String saveManager(@ModelAttribute("manager") Manager manager) {			
		managerService.saveManager(manager);
		return "redirect:/api/managers";
	}	
	
	//Изменение менеджера
	@GetMapping("/api/managers/{id}/manager-edit")
	public String editManager(Model model, @PathVariable("id") int id) {
		model.addAttribute("manager", managerService.getManager(id));
		return "manager-edit";
	}	
	
	//Обновление информации о менеджере
	@PatchMapping("/api/managers/{id}")
	public String updateManager(@ModelAttribute("manager") Manager manager, @PathVariable("id") int id) {
		managerService.updateManager(manager, id);
		return "redirect:/api/managers";
	}	
	
	//Удаление менеджера
	@DeleteMapping("/api/managers/{id}")
	public String deleteManager(@PathVariable("id") int id) {
		managerService.deleteManager(id);
		return "redirect:/api/managers";
	}
	
	//Переход к расчету зарплаты данного менеджера
	@GetMapping("/api/managers/{id}/manager-calculate")
	public String calculateManager(Model model, @PathVariable("id") int id) {
		model.addAttribute("manager", managerService.getManager(id));
		return "manager-calculate";
	}
	
/*	@PostMapping("/api/managers/{id}/manager-calculate")
	public String setProfits(@ModelAttribute("salesProfit") SalesProfit salesProfit) {
		salesProfit.se
		return "/api/managers/{id}/manager-calculate";
	}*/
	
	
}
