package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.SocietyNames;
import com.app.service.ISocietyNamesService;

@RestController
@RequestMapping("/society")
@CrossOrigin(origins="http://localhost:4200")
public class SocietyNamesController {
	//dep
	@Autowired
	private ISocietyNamesService service;
	
	
	public SocietyNamesController()
	{
		System.out.println("in cstr of "+getClass().getName());
	}
	//
	@GetMapping
	public ResponseEntity<?>listAllSocietyNames()
	{
		System.out.println("in list of society");
		List<SocietyNames>societyNames=service.getAllSocietyNames();
		if(societyNames.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return  new ResponseEntity<>(societyNames,HttpStatus.OK);
	}
	//req
	//req handling for new user
		@PostMapping
		public ResponseEntity<?>addSocietyNames(@RequestBody SocietyNames s)
		{
			System.out.println("in add socirty "+s);
			try {
				SocietyNames societynames=service.addSocietyNamesDetails(s);
				return new ResponseEntity<>(societynames,HttpStatus.OK);
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		/*@PostMapping
		public ResponseEntity<?> addUserDetails(@RequestBody Users a) {
			System.out.println("in add " + a);
			return new ResponseEntity<>(udao.save(a), HttpStatus.CREATED);
		}
	*/
		
	@DeleteMapping("/{sid}")
	public String deleteSociety(@PathVariable int sid)
	{
		 System.out.println("in del society"+sid);
		 return service.deleteSociety(sid);
	}
}
