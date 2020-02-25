package com.bigcracko.waterpolo.waterpolo;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bigcracko.waterpolo.waterpolo.division.Division;
import com.bigcracko.waterpolo.waterpolo.division.DivisionRepository;
import com.bigcracko.waterpolo.waterpolo.event.Event;
import com.bigcracko.waterpolo.waterpolo.event.EventRepository;
import com.bigcracko.waterpolo.waterpolo.game.Game;
import com.bigcracko.waterpolo.waterpolo.game.GameRepository;
import com.bigcracko.waterpolo.waterpolo.location.Location;
import com.bigcracko.waterpolo.waterpolo.location.LocationRepository;
import com.bigcracko.waterpolo.waterpolo.team.Team;
import com.bigcracko.waterpolo.waterpolo.team.TeamRepository;

@Component
public class InitCommandLineRunner implements CommandLineRunner {
	
	private final Logger logger = LoggerFactory.getLogger(InitCommandLineRunner.class);

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private DivisionRepository divisionRepository;

	@Autowired
	private GameRepository gameRepository;

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
//		eventRepository.deleteAll();
//		divisionRepository.deleteAll();
//		gameRepository.deleteAll();
//		locationRepository.deleteAll();
//		teamRepository.deleteAll();

		// Event
//		LocalDateTime startTime = LocalDateTime.of(2019, 10, 15, 8, 0);
//		LocalDateTime endTime = LocalDateTime.of(2019, 10, 17, 20, 0);
//		Event kap7 = new Event("Kap 7", startTime, endTime);
//		eventRepository.save(kap7);
//		
//		startTime = LocalDateTime.of(2019, 11, 15, 8, 0);
//		endTime = LocalDateTime.of(2019, 11, 17, 20, 0);
//		Event event = new Event("Orange Cup", startTime, endTime);
//		eventRepository.save(event);
//		
//		startTime = LocalDateTime.of(2019, 12, 15, 8, 0);
//		endTime = LocalDateTime.of(2019, 12, 17, 20, 0);
//		event = new Event("Heinman Tournament", startTime, endTime);
//		eventRepository.save(event);
//		
//		startTime = LocalDateTime.of(2020, 1, 15, 8, 0);
//		endTime = LocalDateTime.of(2020, 1, 17, 20, 0);
//		event = new Event("Rick Pallow Invitational", startTime, endTime);
//		eventRepository.save(event);
//		
//
//		// fetch event
//		logger.debug("Event:");
//		List<Event> eventsResult = eventRepository.findAll();
//		eventsResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//
//		// Division
//		Division division = new Division(kap7.getId(), "12U Boys Classic", false);
//		divisionRepository.save(division);
//		Division promotedDivision = new Division(kap7.getId(), "12U Boys Platinum", true);
//		divisionRepository.save(promotedDivision);
//		Division division2 = new Division(kap7.getId(), "12U Boys Gold", false);
//		divisionRepository.save(division2);
//		division2 = new Division(kap7.getId(), "14U Boys Classic", false);
//		divisionRepository.save(division2);
//		division2 = new Division(kap7.getId(), "14U Boys Platinum", false);
//		divisionRepository.save(division2);
//		division2 = new Division(kap7.getId(), "14U Boys Gold", false);
//		divisionRepository.save(division2);
//
//		// fetch all divisions
//		logger.debug("Divisions found:");
//		List<Division> divisionsResult = divisionRepository.findAll();
//		divisionsResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//
//		// add some teams
//		List<Team> teams = new ArrayList<>();
//		Team kahuna = new Team("Kahuna", "kahuna.jpg", true);
//		Team socal = new Team("Socal-B", "socal.jpg", true);
//		teams.add(kahuna);
//		teams.add(socal);
//		Team empire = new Team("Empire", "empire.jpg", true);
//		Team lagunaHills = new Team("Laguna Hills", "laguna.jpg", true);
//		teams.add(empire);
//		teams.add(lagunaHills);
//		teamRepository.saveAll(teams);
//
//		// fetch all teams
//		logger.debug("Teams found with findAll():");
//		List<Team> teamsResult = teamRepository.findAll();
//		teamsResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//		
//		promotedDivision.setTeams(teams);
//		divisionRepository.save(promotedDivision);
//
//		// Location
//		Location location = new Location();
//		location.setName("El Toro HS 2");
//		location.setMapUrl("http://google.com");
//		locationRepository.save(location);
//		
//		Location tustinHigh = new Location();
//		tustinHigh.setName("Tustin High School");
//		tustinHigh.setMapUrl("http://google.com");
//		locationRepository.save(tustinHigh);
//
//		// fetch all locations
//		logger.debug("Locations found with findAll():");
//		List<Location> locationsResult = locationRepository.findAll();
//		locationsResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//
//		// Game
//		Game game = new Game();
//		game.setEventId(event.getId());
//		game.setDivisionId(promotedDivision.getId());
//		game.setGameId("12BX-001");
//		game.setDarkCaps(kahuna);
//		game.setWhiteCaps(socal);
//		game.setType(Game.GameType.RRA);
//		game.setLocation(location);
//		game.setStartTime(LocalDateTime.now());
//		gameRepository.save(game);
//		
//		Game game2 = new Game();
//		game2.setEventId(event.getId());
//		game2.setDivisionId(promotedDivision.getId());
//		game2.setGameId("12BX-002");
//		game2.setDarkCaps(empire);
//		game2.setWhiteCaps(lagunaHills);
//		game2.setType(Game.GameType.RRA);
//		game2.setLocation(tustinHigh);
//		game2.setStartTime(LocalDateTime.now().plus(Period.ofDays(1)));
//		gameRepository.save(game2);
//
//		// fetch all games
//		logger.debug("Games found with findAll():");
//		List<Game> gamesResult = gameRepository.findAll();
//		gamesResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//
//		//Find games by event
//		gamesResult = gameRepository.findByEventId(event.getId());
//		logger.debug("findByEventId(event.getId():");
//		gamesResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
//		
//		gamesResult = gameRepository.findByDivisionIdOrderByStartTimeAsc(division.getId());
//		logger.debug("findByDivisionId(division.getId():");
//		gamesResult.stream().forEach(e -> logger.debug(e.toString()));
//		logger.debug("-------------------------------");
	}

}
