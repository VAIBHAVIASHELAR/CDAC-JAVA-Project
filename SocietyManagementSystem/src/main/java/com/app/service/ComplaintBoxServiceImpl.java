package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IComplaintBoxDao;
import com.app.pojos.ComplaintBox;
@Service
@Transactional
public class ComplaintBoxServiceImpl implements IComplaintBoxService {
	//dep
		@Autowired
		private IComplaintBoxDao dao;
		
	@Override
	public List<ComplaintBox> getAllComplaintBox() {
		System.out.println("dao impl class "+dao.getClass().getName());
		return dao.findAll();
	}

	@Override
	public ComplaintBox addComplaintBoxDetails(ComplaintBox transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}

	@Override
	public String deleteComplaint(int cid) {
		dao.deleteById(cid);
		return "Complaint  with id= "+cid+" deleted..." ;
	}
	

}

