package com.app.pojos;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BillsAndPayments")
public class BillsAndPayments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MId")
	private Integer mId;
	
	@OneToOne
	@JoinColumn(name = "UId",nullable = false)
	private Users userId;
	
	@Column(name = "WaterBill")
	private Integer WaterBill;
	
	@Column(name = "ElectricityBill")
	private Integer ElectricityBill;
	
	@Column(name = "RegularFund")
	private Integer regFund;
	
	@Column(name = "TotalBill")
	private Integer totalBill;
	
	@Column(name="EntryDate")
	private LocalDate entryDate;
	
	@Column(name="PaymentId",length = 20,unique=true)
	private String paymentId;
	
	@Column(name="PaymentDate")
	private LocalDate paymentDate;
	
	@Column(name="Status")
	private boolean bpStatus;
	
	public BillsAndPayments() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BillsAndPayments(Integer mId, Users userId, Integer waterBill, Integer electricityBill, Integer regFund,
			Integer totalBill, LocalDate entryDate, String paymentId, LocalDate paymentDate, boolean bpStatus) {
		super();
		this.mId = mId;
		this.userId = userId;
		WaterBill = waterBill;
		ElectricityBill = electricityBill;
		this.regFund = regFund;
		this.totalBill = totalBill;
		this.entryDate = entryDate;
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.bpStatus = bpStatus;
	}

	
}
