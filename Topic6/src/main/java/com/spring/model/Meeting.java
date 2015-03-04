package com.spring.model;

import java.util.List;

public class Meeting {

	private Long id;
	private String desc;
	private List<Attendee> attendees;
	private Room room;
	private TimeSlot slot;
	private Boolean status; //False = meeting is canceled;
	/*
	public Meeting (Long _id, String _desc, List<Attendee> _attendees, Room _room, TimeSlot _slot) {
		this.id = _id;
		this.desc = _desc;
		this.attendees = _attendees;
		this.room = _room;
		this.slot = _slot;
		this.status = true;
	}
*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public TimeSlot getSlot() {
		return slot;
	}

	public void setSlot(TimeSlot slot) {
		this.slot = slot;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
