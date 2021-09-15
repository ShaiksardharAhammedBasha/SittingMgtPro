package com.sittingmgtpro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sittingmgtpro.models.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer> {
	
	// void findByEmailAndLastName(String email, String lastName);
	
	boolean findByEmailAndPassword(String email, String password);
	

}
