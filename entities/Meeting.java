package topic6.entities;

import java.util.Date;
import java.util.List;

public class Meeting {
	
	private int id; 
	private Room room;
	private List<Attendee> attendees;
	private Date date;
	private String slotTime;
	
	public Meeting () {}
	
	public Meeting(int id, Room room, List<Attendee> attendees, Date date,
			String slotTime) {
		this.id = id;
		this.room = room;
		this.attendees = attendees;
		this.date = date;
		this.slotTime = slotTime;
	}

	public int getCod() {
		return id;
	}

	public void setCod(int cod) {
		this.id = cod;
	}


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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	
	public Meeting copyFrom(Meeting meeting) {
		 if (meeting != null) {
			 this.id = meeting.id;
			 this.room = meeting.room;
			 this.attendees = meeting.attendees;
			 this.date = meeting.date;
			 this.slotTime = meeting.slotTime;
		 }
		 //return meeting.clone();
		 return this;
	 }	
}
