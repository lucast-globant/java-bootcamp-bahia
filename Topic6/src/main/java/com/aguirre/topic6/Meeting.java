package com.aguirre.topic6;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meeting {

	@Id
	@GeneratedValue
	private Long id;
	private String meetingName;
	private List<Attendee> attendees;
	private Room room;
	private int timeSlot;

	public Meeting(String meetingName, List<Attendee> attendees, Room room, int timeSlot) {
		update(meetingName, attendees, room, timeSlot);
	}

	public Long getId() {
		return id;
	}

	public void update(String meetingName, List<Attendee> attendees, Room room, int timeSlot) {
		this.meetingName = meetingName;
		this.attendees = attendees;
		this.room = room;
		this.timeSlot = timeSlot;
	}

	public String getMeetingName() {
		return meetingName;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public Room getRoom() {
		return room;
	}

	public int getTimeSlot() {
		return timeSlot;
	}
}
