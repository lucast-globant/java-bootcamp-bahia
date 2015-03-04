package entities;

public class Meeting {
	private static int uniqueMeetingID = 1;
	private int idMeeting;
	private String description;
	private Room room;

	public Meeting(String description, Room room) {
		this.idMeeting = newIdMeeting();
		this.description = description;
		this.room = room;
	}

	private int newIdMeeting() {
		return uniqueMeetingID++;
	}

	public int getMeetingID() {
		return idMeeting;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
