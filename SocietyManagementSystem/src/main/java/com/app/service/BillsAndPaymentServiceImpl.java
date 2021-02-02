package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IBillsAndPaymentDao;
import com.app.pojos.BillsAndPayments;
@Service
@Transactional
public class BillsAndPaymentServiceImpl implements IBillsAndPaymentService {
	//dep
			@Autowired
			private IBillsAndPaymentDao dao;
			
	@Override
	public List<BillsAndPayments> getAllBillsAndPayment() {
		System.out.println("dao impl class "+dao.getClass().getName());
		return dao.findAll();
	}

	@Override
	public BillsAndPayments addBillsAndPaymentsDetails(BillsAndPayments transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}
	
	

}
