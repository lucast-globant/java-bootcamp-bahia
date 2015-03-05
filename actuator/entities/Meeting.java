package topic6.actuator.entities;

import java.util.List;

public class Meeting {
	private String name;
	private int id;
	private Room room;
	private List<Atendee> attendees;

	public List<Atendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Atendee> attendees) {
		this.attendees = attendees;
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

	public Meeting(String name,Room room, List<Atendee> attendees, int id) {

		this.name = name;
		this.room = room;
		this.attendees = attendees;
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
