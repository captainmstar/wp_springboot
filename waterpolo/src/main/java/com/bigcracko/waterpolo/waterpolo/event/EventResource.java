package com.bigcracko.waterpolo.waterpolo.event;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EventResource {
	
	private final Logger logger = LoggerFactory.getLogger(EventResource.class);
	
	@Autowired
	private EventRepository repository;

	@GetMapping("/events")
	public List<Event> getEvents() {
		logger.debug("getEvents()");
		return repository.findAll();
	}
	
	@GetMapping("/events/{id}")
	public Event getEvent(@PathVariable String id) {
		logger.debug(String.format("getEvent() with id: %s", id));
		Event event = repository.findById(id).orElse(null);
		logger.debug("event: " + event);
		return event;
	}
	
}
