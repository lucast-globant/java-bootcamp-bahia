package com.aguirre.topic6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue
	private Long id;
	private String roomName;
	private int capacity;

	public Room(String roomName, int capacity) {
		this.roomName = roomName;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public String getRoomName() {
		return roomName;
	}

	public int getCapacity() {
		return capacity;
	}
}
