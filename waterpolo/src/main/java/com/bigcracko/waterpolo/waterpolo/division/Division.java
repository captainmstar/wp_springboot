package com.bigcracko.waterpolo.waterpolo.division;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bigcracko.waterpolo.waterpolo.team.Team;

@Document
public class Division {

	@Id
	private String id;
	@Indexed
	private String eventId;
	private String name;
	private boolean promoted;
	@DBRef
	private List<Team> teams;

	public Division() {
	}

	public Division(String eventId, String name, boolean promoted) {
		this.eventId = eventId;
		this.name = name;
		this.promoted = promoted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public boolean isPromoted() {
		return promoted;
	}

	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Division [id=" + id + ", eventId=" + eventId + ", name=" + name + ", promoted=" + promoted + ", teams="
				+ teams + "]";
	}
}
