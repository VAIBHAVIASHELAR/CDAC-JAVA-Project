package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="noticeboard")
public class NoticeBoard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NId")
	private Integer nId;
	
	@ManyToOne
    @JoinColumn(name="UId",nullable = false)
    private Users Notices;
	
	
	
	@Column(name="NoticeDate")
	private LocalDate noticeDate;
	
	@Column(name="NSubject",length = 20)
	private String nSubject;
	
	@Column(name="NDescription",length = 50)
	private String nDescription;
	
	@Column(name="NStatus")
	private boolean nStatus;

	public NoticeBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticeBoard(Integer nId, Users notices, LocalDate noticeDate, String nSubject, String nDescription,
			boolean nStatus) {
		super();
		this.nId = nId;
		Notices = notices;
		this.noticeDate = noticeDate;
		this.nSubject = nSubject;
		this.nDescription = nDescription;
		this.nStatus = nStatus;
	}

	public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
	}

	public Users getNotices() {
		return Notices;
	}

	public void setNotices(Users notices) {
		Notices = notices;
	}

	public LocalDate getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(LocalDate noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getnSubject() {
		return nSubject;
	}

	public void setnSubject(String nSubject) {
		this.nSubject = nSubject;
	}

	public String getnDescription() {
		return nDescription;
	}

	public void setnDescription(String nDescription) {
		this.nDescription = nDescription;
	}

	public boolean isnStatus() {
		return nStatus;
	}

	public void setnStatus(boolean nStatus) {
		this.nStatus = nStatus;
	}

	@Override
	public String toString() {
		return "NoticeBoard [nId=" + nId + ", Notices=" + Notices + ", noticeDate=" + noticeDate + ", nSubject="
				+ nSubject + ", nDescription=" + nDescription + ", nStatus=" + nStatus + "]";
	}
	
}


