package topic6.actuator.entities;

import java.sql.Time;
import java.util.List;

public class Meeting {
	private String name;
	private int id;
	private Room room;
	private List<Atendee> atendees;
	private Time timeSlot;

	public Time getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(Time timeSlot) {
		this.timeSlot = timeSlot;
	}

	public List<Atendee> getAtendees() {
		return atendees;
	}

	public void setAtendees(List<Atendee> atendees) {
		this.atendees = atendees;
	}

	public Meeting() {

	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room rooms) {
		this.room = rooms;
	}

	public String getName() {
		return name;
	}

	public Meeting(String name, Room room, List<Atendee> atendees, int id) {

		this.name = name;
		this.room = room;
		this.atendees = atendees;
		this.setId(id);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
