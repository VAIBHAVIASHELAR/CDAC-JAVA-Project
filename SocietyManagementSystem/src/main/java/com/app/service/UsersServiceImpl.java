package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUsersDao;
import com.app.pojos.Users;

@Service
@Transactional
public class UsersServiceImpl implements IUsersService {
	//dep
	@Autowired
	private IUsersDao dao;

	@Override
	public List<Users> getAllUsers() {
		System.out.println("dao impl class"+dao.getClass().getName());
		return dao.findAll();
	}

	@Override
	public Users addUsersDetails(Users transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}

	@Override
	public String deleteUser(int uid) {
		dao.deleteById(uid);
		return "User with id="+uid+" deleted";
	}

	@Override
	public Users fetchUserByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.findByEmail(email);
	}

	@Override
	public Users fetchUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return dao.findByEmailAndPassword(email, password);
	}

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	

	

	
}
