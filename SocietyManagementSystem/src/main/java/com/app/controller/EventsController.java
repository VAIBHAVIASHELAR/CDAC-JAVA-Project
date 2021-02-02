package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Events;
//import com.app.pojos.SocietyNames;
import com.app.service.IEventsService;

@RestController
@RequestMapping("/events")
public class EventsController {
	//dep
	@Autowired
	private IEventsService service;
	
	public EventsController()
	{
		System.out.println("in cstr of "+getClass().getName());
	}

	@GetMapping
	public ResponseEntity<?>listAllEvents()
	{
		System.out.println("in list of events");
		List<Events> events=service.getAllEvents();
		if(events.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(events,HttpStatus.OK);
	}
	
	//req handling for new event
			@PostMapping
			public ResponseEntity<?>addEvents(@RequestBody Events ev)
			{
				System.out.println("in add events "+ev);
				try {
					Events events=service.addEventsDetails(ev);
					return new ResponseEntity<>(events,HttpStatus.OK);
				}
				catch(RuntimeException e)
				{
					e.printStackTrace();
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			@DeleteMapping("/{eid}")
			public String deleteSociety(@PathVariable int eid)
			{
				 System.out.println("in del Event"+eid);
				 return service.deleteEvent(eid);
			}
}
