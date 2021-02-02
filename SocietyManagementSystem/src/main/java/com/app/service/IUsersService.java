package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojos.Users;

public interface IUsersService {
	//list all users
	List<Users>getAllUsers();
	//add new users
	Users addUsersDetails(Users transientPOJO);
	//del user
	String deleteUser(int uid);
	
	
	//register
		public Users saveUser(Users user);
		

	//fetch emailid for checking if already exist or not
		public Users fetchUserByEmail(String email1);
		
		public Users fetchUserByEmailAndPassword(String email,String password);
		
	}
