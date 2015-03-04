package rest;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Meeting {
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	private Room room;
	
	@JsonIgnore
	@OneToMany (mappedBy="meeting") 
	private List<Attendee> attendees;
	
	private int time_slot;

	public int getTime_slot() {
		return time_slot;
	}

	public void setTime_slot(int time_slot) {
		this.time_slot = time_slot;
	}

	public Meeting(Room room, List<Attendee> attendees, int time_slot) {
		this.room = room;
		this.attendees = attendees;
		this.time_slot = time_slot;
	}
	
	public Meeting() {}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", room=" + room + ", attendees="
				+ attendees + ", time_slot=" + time_slot + "]";
	}

		
}