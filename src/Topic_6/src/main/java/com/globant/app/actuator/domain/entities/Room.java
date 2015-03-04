package com.globant.app.actuator.domain.entities;

public class Room extends Identifiable {

	private String name;
	private int capacity;

	public Room() {
	}

	public Room(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
