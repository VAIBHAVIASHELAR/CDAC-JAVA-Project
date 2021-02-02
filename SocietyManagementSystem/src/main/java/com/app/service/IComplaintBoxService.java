package com.app.service;

import java.util.List;

import com.app.pojos.ComplaintBox;

public interface IComplaintBoxService {
//list
	List<ComplaintBox>getAllComplaintBox();
	//add new complaint
	ComplaintBox addComplaintBoxDetails(ComplaintBox transientPOJO);
	
	//delete
		String deleteComplaint(int cid);
}
