package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.BillsAndPayments;
import com.app.pojos.SocietyNames;
import com.app.service.IBillsAndPaymentService;

@RestController
@RequestMapping("/billspayment")
public class BillsAndPaymentController {
	//dep
			@Autowired
			private IBillsAndPaymentService service;
			
			public BillsAndPaymentController()
			{
				System.out.println("in cstr of "+getClass().getName());
			}

			@GetMapping
			public ResponseEntity<?>listAllBillsAndPayments()
			{
				System.out.println("in list of BillsAndPayment");
				List<BillsAndPayments> billspay=service.getAllBillsAndPayment();
				if(billspay.isEmpty())
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				return new ResponseEntity<>(billspay,HttpStatus.OK);
			}
			
			@PostMapping
			public ResponseEntity<?>addBillsAndPaymentsDetails(@RequestBody BillsAndPayments b)
			{
				System.out.println("in add socirty "+b);
				try {
					BillsAndPayments billpay=service.addBillsAndPaymentsDetails(b);
					return new ResponseEntity<>(billpay,HttpStatus.OK);
				}
				catch(RuntimeException e)
				{
					e.printStackTrace();
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
}
