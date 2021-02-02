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

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="Society")
public class SocietyNames {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SId")
	private Integer sId;
	
	@Column(name="SName",length = 15,unique = true)
	private String sName;
	
	@Column(name="Address",length = 50)
	private String address;
	
	@Column(name="City",length = 20)
	private String city;
	
	@Column(name="PinCode",length = 10)
	private Integer pinCode;
	
	@Column(name="TotalHouses",length = 20)
	private Integer noOfHouses;
	
	@JsonProperty(value="EntryDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="EntryDate",length=20)
	private LocalDate entryDate;
	
	@Column(name="Status")
	private boolean status;
	

	@JsonIgnore
	@OneToMany(mappedBy = "societyname",cascade=CascadeType.ALL)
	private List<Users> users =new ArrayList<>();
	
	
	public SocietyNames() {
		//super();
	}


	public SocietyNames(Integer sId, String sName, String address, String city, Integer pinCode, Integer noOfHouses,
			LocalDate entryDate, boolean status, List<Users> users) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.noOfHouses = noOfHouses;
		this.entryDate = entryDate;
		this.status = status;
		this.users = users;
	}


	public Integer getsId() {
		return sId;
	}


	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getPinCode() {
		return pinCode;
	}


	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}


	public Integer getNoOfHouses() {
		return noOfHouses;
	}


	public void setNoOfHouses(Integer noOfHouses) {
		this.noOfHouses = noOfHouses;
	}


	public LocalDate getEntryDate() {
		return entryDate;
	}


	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public List<Users> getUsers() {
		return users;
	}


	public void setUsers(List<Users> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "SocietyNames [sId=" + sId + ", sName=" + sName + ", address=" + address + ", city=" + city
				+ ", pinCode=" + pinCode + ", noOfHouses=" + noOfHouses + ", entryDate=" + entryDate + ", status="
				+ status + ", users=" + users + "]";
	}
		
}

