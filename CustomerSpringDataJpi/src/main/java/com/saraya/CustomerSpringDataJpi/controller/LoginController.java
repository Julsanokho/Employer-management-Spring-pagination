package com.saraya.CustomerSpringDataJpi.controller;

import com.saraya.CustomerSpringDataJpi.service.LoginService; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
		@Autowired
		LoginService loginService;
		  @RequestMapping(value="/login", method=RequestMethod.GET)
		public String loginApp() {
		return "login";
		}
		@RequestMapping(value="/login", method=RequestMethod.POST)		
		public String home(@RequestParam String username,
				           @RequestParam String password,ModelMap model) {
			if(loginService.isValid(username, password)) {
				model.addAttribute("username", username);
				model.addAttribute("messageSuccess", ", Your has been logged successfully!");				
				return "welcome";
			}
			else {
			model.addAttribute("errorMessage", "Identify incorrect !");
			return "login";
			}
		}

	}
