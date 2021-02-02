package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Events")
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EId")
	private Integer eId;
	
	
	//bi-directional many-to-one association to users
		//@OneToMany(mappedBy="events",cascade=CascadeType.ALL)
		//@JsonManagedReference
		//private List<Users> users;
	@JsonIgnore
	@OneToMany(mappedBy = "events",cascade=CascadeType.ALL)
	private List<Users> uid =new ArrayList<>();
	
	
	//@OneToMany(mappedBy = "events",cascade = CascadeType.ALL)
	//private List<Users> users=new ArrayList<>();
	
	@Column(name="ESubject",length = 20)
	private String eSubject;
	
	@Column(name="EDescription",length = 50)
	private String eDescription;
	
	@Column(name="EOccation",length = 20)
	private String eOccation;
	
	@Column(name="EVenue",length = 50)
	private String eVenue;
	
	
	@Column(name="EDate")
	private LocalDate eDate;
	
	@Column(name="E_Expenditure")
	private Double eExpenditure;
	
	@Column(name="EStatus")
	private boolean eStatus;
	
	

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Events(Integer eId, String eSubject, String eDescription, String eOccation, String eVenue, LocalDate eDate,
			Double eExpenditure, boolean eStatus) {
		super();
		this.eId = eId;
		this.eSubject = eSubject;
		this.eDescription = eDescription;
		this.eOccation = eOccation;
		this.eVenue = eVenue;
		this.eDate = eDate;
		this.eExpenditure = eExpenditure;
		this.eStatus = eStatus;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteSubject() {
		return eSubject;
	}

	public void seteSubject(String eSubject) {
		this.eSubject = eSubject;
	}

	public String geteDescription() {
		return eDescription;
	}

	public void seteDescription(String eDescription) {
		this.eDescription = eDescription;
	}

	public String geteOccation() {
		return eOccation;
	}

	public void seteOccation(String eOccation) {
		this.eOccation = eOccation;
	}

	public String geteVenue() {
		return eVenue;
	}

	public void seteVenue(String eVenue) {
		this.eVenue = eVenue;
	}

	public LocalDate geteDate() {
		return eDate;
	}

	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}

	public Double geteExpenditure() {
		return eExpenditure;
	}

	public void seteExpenditure(Double eExpenditure) {
		this.eExpenditure = eExpenditure;
	}

	public boolean geteStatus() {
		return eStatus;
	}

	public void seteStatus(boolean eStatus) {
		this.eStatus = eStatus;
	}

	@Override
	public String toString() {
		return "Events [eId=" + eId + ", eSubject=" + eSubject + ", eDescription=" + eDescription + ", eOccation="
				+ eOccation + ", eVenue=" + eVenue + ", eDate=" + eDate + ", eExpenditure=" + eExpenditure
				+ ", eStatus=" + eStatus + "]";
	}
	
	
}
