package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IUsersDao;
import com.app.pojos.Users;
import com.app.service.IUsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	//dep
	@Autowired
	private IUsersService service;
	
	@Autowired
	private IUsersDao udao;
	
	public UsersController()
	{
		System.out.println("in cstr of "+getClass().getName());
	}
	//RESTful end 
	@GetMapping
	public ResponseEntity<?>listAllUsers()
	{
		System.out.println("in list all products");
		List<Users>users=service.getAllUsers();
		if(users.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(users,HttpStatus.OK);
		
	}
	//req handling for new user
	
	/*@PostMapping
	public ResponseEntity<?>addUsers(@RequestBody Users u)
	{
		System.out.println("in add users "+u);
		try {
			Users saveUsers=service.addUsersDetails(u);
			return new ResponseEntity<>(saveUsers,HttpStatus.OK);
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

*/
	
	@PostMapping
	public ResponseEntity<?> addUserDetails(@RequestBody Users a) {
		System.out.println("in add " + a);
		return new ResponseEntity<>(udao.save(a), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{uid}")
	public String deleteUser(@PathVariable int uid)
	{
		System.out.println("in delete user"+uid);
		return service.deleteUser(uid);
	}
    
   
}
