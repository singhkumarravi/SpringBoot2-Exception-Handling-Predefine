package com.olive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

	@RequestMapping("/show")
	public String show(Model model) {
		
		return "Home";
	}
}
