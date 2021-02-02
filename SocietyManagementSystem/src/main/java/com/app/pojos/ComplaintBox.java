package com.app.pojos;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Complaintbox")
public class ComplaintBox {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CId")
	private Integer cId;
	
	@ManyToOne
    @JoinColumn(name="UId",nullable = false)
    private Users users;
	
	@Column(name="Description",length = 50)
	private String description;
		
	@Column(name="ComplainDate")
	private LocalDate complainDate;
	
	@Column(name="CStatus")
	private boolean cStatus;
	
	
	@Column(name="CloseDate")
	private LocalDate closeDate;

	public ComplaintBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplaintBox(Integer cId, Users users, String description, LocalDate complainDate, boolean cStatus,
			LocalDate closeDate) {
		super();
		this.cId = cId;
		this.users = users;
		this.description = description;
		this.complainDate = complainDate;
		this.cStatus = cStatus;
		this.closeDate = closeDate;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getComplainDate() {
		return complainDate;
	}

	public void setComplainDate(LocalDate complainDate) {
		this.complainDate = complainDate;
	}

	public boolean iscStatus() {
		return cStatus;
	}

	public void setcStatus(boolean cStatus) {
		this.cStatus = cStatus;
	}

	public LocalDate getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}

	@Override
	public String toString() {
		return "ComplaintBox [cId=" + cId + ", users=" + users + ", description=" + description + ", complainDate="
				+ complainDate + ", cStatus=" + cStatus + ", closeDate=" + closeDate + "]";
	}


}
