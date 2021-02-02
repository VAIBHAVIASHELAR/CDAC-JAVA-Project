package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IEventsDao;
import com.app.pojos.Events;

@Service
@Transactional

public class EventsServiceImpl implements IEventsService {

	//dep
	@Autowired
	private IEventsDao dao;
	
	@Override
	public List<Events> getAllEvents() {
		System.out.println("dao impl class "+getClass().getName());
		return dao.findAll();
	}

	@Override
	public Events addEventsDetails(Events transientPOJO) {
		// TODO Auto-generated method stub
		return dao.save(transientPOJO);
	}

	@Override
	public String deleteEvent(int eid) {
		dao.deleteById(eid);
		return "Event  with id= "+eid+" deleted..." ;
	}

	
	

}
