package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Users;
import com.app.service.IUsersService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RegisterController {
	@Autowired
	private IUsersService service;
	
	
	@PostMapping("/register")	
	@CrossOrigin(origins="http://localhost:4200")
	public  Users registerUser(@RequestBody Users user) throws Exception  {
		String tempEmailId=user.getEmail();
		if(tempEmailId!=null && !"".equals(tempEmailId))
		{
			Users userObj=service.fetchUserByEmail(tempEmailId);
			if(userObj !=null)
			{
				throw new Exception("USER WITH THIS EMAIL_ID ALREADY EXISTS, KINDLY CHECK UR ID!!!!!!!!!!!!");
			}
		}
		Users userObj=null;
		userObj=service.saveUser(user);
		return userObj;
		
	}
	
	@PostMapping("/login")
	//@CrossOrigin(origins="*")
	@CrossOrigin(origins="http://localhost:4200")
    public Users loginCustomer(@RequestBody Users org) throws Exception
    {
        String tempemail = org.getEmail();
        String temppassword = org.getPassword();
        Users obj=null;
        if(tempemail != null && temppassword != null)
        {
            obj = service.fetchUserByEmailAndPassword(tempemail,temppassword);
        }
        if(obj == null)
        {
            throw new Exception ("login user not present please register first");
        }
        
    return obj;
    }
	
}


