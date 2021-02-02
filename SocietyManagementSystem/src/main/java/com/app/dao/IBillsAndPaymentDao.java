package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.BillsAndPayments;

public interface IBillsAndPaymentDao extends JpaRepository<BillsAndPayments,Integer>{

}
