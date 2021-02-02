package com.app.service;

import java.util.List;

import com.app.pojos.Events;

public interface IEventsService {
//list all events
	List<Events>getAllEvents();
	//
	Events addEventsDetails(Events transientPOJO);
	
	//delete
		String deleteEvent(int eid);
}
