package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ComplaintBox;

public interface IComplaintBoxDao extends JpaRepository<ComplaintBox,Integer>{

}
