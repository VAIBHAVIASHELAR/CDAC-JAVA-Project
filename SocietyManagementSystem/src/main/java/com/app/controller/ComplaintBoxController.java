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

import com.app.dao.IComplaintBoxDao;
import com.app.pojos.ComplaintBox;
import com.app.pojos.Users;
import com.app.service.IComplaintBoxService;

@RestController
@RequestMapping("/complaintbox")
public class ComplaintBoxController {
	//dep
		@Autowired
		private IComplaintBoxService service;
		
		@Autowired
		private IComplaintBoxDao cdao;
		
		public ComplaintBoxController()
		{
			System.out.println("in cstr of "+getClass().getName());
		}

		@GetMapping
		public ResponseEntity<?>listAllComplaintBox()
		{
			System.out.println("in list of ComplaintBox");
			List<ComplaintBox> complaintbox=service.getAllComplaintBox();
			if(complaintbox.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<>(complaintbox,HttpStatus.OK);
		}
		
		//req handling for new Complaint
			/*	@PostMapping
				public ResponseEntity<?>addCoplaintBox(@RequestBody ComplaintBox c)
				{
					System.out.println("in add complaint "+c);
					try {
						ComplaintBox complaintbox=service.addComplaintBoxDetails(c);
						return new ResponseEntity<>(complaintbox,HttpStatus.OK);
					}
					catch(RuntimeException e)
					{
						e.printStackTrace();
						return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}*/
		
		@PostMapping
		public ResponseEntity<?> addComplaintDetails(@RequestBody ComplaintBox a) {
			System.out.println("in add " + a);
			return new ResponseEntity<>(cdao.save(a), HttpStatus.CREATED);
		}
		
		
		@DeleteMapping("/{cid}")
		public String deleteComplaint(@PathVariable int cid)
		{
			 System.out.println("in del Event"+cid);
			 return service.deleteComplaint(cid);
		}

}
