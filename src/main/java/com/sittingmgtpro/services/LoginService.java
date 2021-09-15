package com.sittingmgtpro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sittingmgtpro.dao.LoginDao;
import com.sittingmgtpro.dao.RegistrationDao;
import com.sittingmgtpro.models.Registration;

@Service
public class LoginService {
	
	//@Autowired
//	private LoginDao dao;
	
	@Autowired
	private RegistrationDao dao;
	

	public boolean validateUserLogin(String email, String lastName) {
		
		Registration reg =  dao.findByEmailAndLastName(email, lastName);
		
		if(reg !=null)
			return true;
		else
			return false;
	}
	
	public boolean validateUserLoginByEmailAndPassword(String email, String password) {
		Registration reg = dao.findByEmailAndPassword(email, password);
		
		boolean reg1 = reg!=null ? true : false ;
		
		return reg1;
	}

}





