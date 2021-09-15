package com.sittingmgtpro.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sittingmgtpro.models.Login;
import com.sittingmgtpro.models.Registration;
import com.sittingmgtpro.services.LoginService;

@Controller
@RequestMapping(value="SittingMgtPro")
public class LoginController {
	
	@Autowired
	private LoginService service;
	

/*	@RequestMapping(value="/userlogin")
	public String validateUserLogin(@ModelAttribute("login") Login login) {
		
		Registration reg = new Registration();
		reg.setEmail(reg.getEmail());
		System.out.println(login.getEmail());
		System.out.println(login.getLastName());
		System.out.println(reg.getEmail());
		
		if(login.getEmail() == reg.getEmail()) {
			return "login-success";
		} else {
			return "login-failure";
		}
		
	} */
	
	@RequestMapping(value="/userlogin")
	public String validateUserLoginByEmailAndPassword(@ModelAttribute("login") Login login) {
		
		String email = login.getEmail();
		System.out.println(login.getEmail());
		String password = login.getPassword();
		System.out.println(login.getPassword());
				
				
		boolean result = service.validateUserLoginByEmailAndPassword(email, password);
		
		if(result) {
			return "login-success";
		} else {
			return "login-failure";
		}
		
	}
	

}











