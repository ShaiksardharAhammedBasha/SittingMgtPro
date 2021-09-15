package com.sittingmgtpro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sittingmgtpro.models.Registration;

@Repository
public interface RegistrationDao extends JpaRepository<Registration, Integer> {
	
	public Registration findByEmailAndLastName(String email, String lastName);
	
	public Registration findByEmailAndPassword(String email, String password);

}
