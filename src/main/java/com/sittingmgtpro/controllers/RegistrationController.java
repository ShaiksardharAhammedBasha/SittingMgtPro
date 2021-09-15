package com.sittingmgtpro.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sittingmgtpro.dao.RegistrationDao;
import com.sittingmgtpro.models.Registration;
import com.sittingmgtpro.services.RegistrationService;

@Controller
@RequestMapping(value="/SittingMgtPro")
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@GetMapping(value="/")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerPage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("registration", new Registration());
		return "register";
	}
	
	@RequestMapping(value="/registerForm", method = RequestMethod.POST)
	public String saveRegisterForm(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("registerForm") Registration registration)
	{
		service.saveRegistrationData(registration);
		return "register-success";
	}
	
	@RequestMapping(value="/login")
	public String loginPage() {
		return "Login";
	}

}



