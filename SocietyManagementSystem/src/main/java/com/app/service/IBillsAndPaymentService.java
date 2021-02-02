package com.app.service;

import java.util.List;

import com.app.pojos.BillsAndPayments;

public interface IBillsAndPaymentService {
	//list
		List<BillsAndPayments>getAllBillsAndPayment();
		//add new bill
		BillsAndPayments addBillsAndPaymentsDetails(BillsAndPayments transientPOJO);
}
