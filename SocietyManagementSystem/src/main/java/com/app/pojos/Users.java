package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UId")
	private Integer uId;
	
	@Column(name="FirstName",length = 15)
	private String fName;
	
	@Column(name="LastName",length = 15)
	private String lName;
	
	@Column(name="EmailId",length = 20,unique = true)
	private String email;
	
	@Column(name="Password",length = 20)
	private String password;
	
	@Column(name="MobileNo",unique = true)
	private String mobNo;
	
	@JsonProperty(value="DateOfBirth")
	@Column(name="DateOfBirth")
	private LocalDate bDate;
	
	@Column(name="Totalmember")
	private Integer memberNos;
	
	@Column(name="BlockNo",length = 20)
	private String BlockNo;
	
	@Column(name="HouseNo",length = 20,unique=true)
	private String HouseNo;
	
	
	//@Temporal(TemporalType.DATE)
	@Column(name="EntryDate",length=20)
	private LocalDate entryDate;
	
	@Enumerated(EnumType.STRING) //col type varchar (enum constant name)
	@Column(name="role",length = 20)
	private Roles userRole;
	
	//one to one bi dir association with BillsAndPayments
		//@OneToOne(mappedBy = "userId",cascade = CascadeType.ALL)
		//private BillsAndPayments billpay;
	
		//bi-directional many-to-one association to Events
		@ManyToOne
		@JoinColumn(name="EId",nullable = false)
		private Events events;
		
		//bi-directional many-to-one association to SocietyNames
	@ManyToOne
    @JoinColumn(name="SId",nullable = false)
    private SocietyNames societyname;

	
	
	//bi-directional many-to-one association to Notices
	@JsonIgnore
	@OneToMany(mappedBy="Notices",cascade=CascadeType.ALL)
	private List<NoticeBoard> notices =new ArrayList<>();
	
	//bi-directional many-to-one association to ComplaintBox
	@JsonIgnore
	@OneToMany(mappedBy = "users",cascade=CascadeType.ALL)
	private List<ComplaintBox> complaints =new ArrayList<>();


	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(Integer uId, String fName, String lName, String email, String password, String mobNo, LocalDate bDate,
			Integer memberNos, String blockNo, String houseNo, LocalDate entryDate, Roles userRole, Events events,
			SocietyNames societyname, List<NoticeBoard> notices, List<ComplaintBox> complaints) {
		super();
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.mobNo = mobNo;
		this.bDate = bDate;
		this.memberNos = memberNos;
		BlockNo = blockNo;
		HouseNo = houseNo;
		this.entryDate = entryDate;
		this.userRole = userRole;
		this.events = events;
		this.societyname = societyname;
		this.notices = notices;
		this.complaints = complaints;
	}


	public Integer getuId() {
		return uId;
	}


	public void setuId(Integer uId) {
		this.uId = uId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobNo() {
		return mobNo;
	}


	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


	public LocalDate getbDate() {
		return bDate;
	}


	public void setbDate(LocalDate bDate) {
		this.bDate = bDate;
	}


	public Integer getMemberNos() {
		return memberNos;
	}


	public void setMemberNos(Integer memberNos) {
		this.memberNos = memberNos;
	}


	public String getBlockNo() {
		return BlockNo;
	}


	public void setBlockNo(String blockNo) {
		BlockNo = blockNo;
	}


	public String getHouseNo() {
		return HouseNo;
	}


	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}


	public LocalDate getEntryDate() {
		return entryDate;
	}


	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}


	public Roles getUserRole() {
		return userRole;
	}


	public void setUserRole(Roles userRole) {
		this.userRole = userRole;
	}


	public Events getEvents() {
		return events;
	}


	public void setEvents(Events events) {
		this.events = events;
	}


	public SocietyNames getSocietyname() {
		return societyname;
	}


	public void setSocietyname(SocietyNames societyname) {
		this.societyname = societyname;
	}


	public List<NoticeBoard> getNotices() {
		return notices;
	}


	public void setNotices(List<NoticeBoard> notices) {
		this.notices = notices;
	}


	public List<ComplaintBox> getComplaints() {
		return complaints;
	}


	public void setComplaints(List<ComplaintBox> complaints) {
		this.complaints = complaints;
	}


	@Override
	public String toString() {
		return "Users [uId=" + uId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", mobNo=" + mobNo
				+ ", bDate=" + bDate + ", memberNos=" + memberNos + ", BlockNo=" + BlockNo + ", HouseNo=" + HouseNo
				+ ", entryDate=" + entryDate + ", userRole=" + userRole + ", events=" + events + ", societyname="
				+ societyname + ", notices=" + notices + ", complaints=" + complaints + "]";
	}
		
		
}
