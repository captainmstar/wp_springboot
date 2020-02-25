package com.bigcracko.waterpolo.waterpolo.game;

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
public class GameResource {
	
	private final Logger logger = LoggerFactory.getLogger(GameResource.class);
	
	@Autowired
	private GameRepository repository;
	
	@GetMapping("/gamesByDivision/{id}")
	public List<Game> getByDivisionId(@PathVariable String id) {
		logger.debug("getByDivisionId(): id: %s", id);
		return repository.findByDivisionIdOrderByStartTimeAsc(id);
	}
}
