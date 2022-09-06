package com.github.yury1991.PayrollWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/api")
	public String index() {
		return "index";
	}		
}
