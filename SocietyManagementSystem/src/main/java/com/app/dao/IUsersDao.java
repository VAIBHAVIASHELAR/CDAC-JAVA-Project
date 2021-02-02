package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Users;

public interface IUsersDao extends JpaRepository<Users,Integer>{
	
	//Users findByEmailAndPassword(String tempemail, String temppassword);
	//public Users findByEmail(String email1);
	
	public Users findByEmail(String emailId);
	public Users findByEmailAndPassword(String email,String password);
	
    
}
