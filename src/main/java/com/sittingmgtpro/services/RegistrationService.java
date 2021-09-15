package com.sittingmgtpro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sittingmgtpro.dao.RegistrationDao;
import com.sittingmgtpro.models.Registration;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDao dao;
	
	// saving Registration Data into db;
	public void saveRegistrationData(Registration registration) {
		System.out.println("dao save method");
		dao.save(registration);
	}
	
	// find Reg Data By Id
	public Optional<Registration> findRegistrationById(int id) {
		return dao.findById(id);
	}
	
	// delete Reg Data By Id
	public void deleteRegistrationById(int id) {
		System.out.println("---int delete Method---------");
		dao.deleteById(id);
	}

}






