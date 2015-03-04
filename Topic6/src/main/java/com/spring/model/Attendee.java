package com.spring.model;

public class Attendee {
	
	private int id;
	private String name;
	private String lastname;
	
	public Attendee (int _id, String _name, String _lastname) {
		this.id = _id;
		this.name = _name;
		this.lastname = _lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
