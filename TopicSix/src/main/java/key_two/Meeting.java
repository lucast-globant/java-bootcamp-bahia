package key_two;

import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Meeting {

	@Id
	@GeneratedValue
	private long id;

	@OneToMany(mappedBy = "meeting")
	private List<Attendee> attendees;

	@ManyToOne
	private Room room;

	private Time timeSlot;

	public Meeting() {
		super();
	}

	public Meeting(Room room) {
		super();
		this.room = room;
	}
	
	public Meeting(Room room, List<Attendee> attendees, Time timeSlot) {
		super();
		this.room = room;
		this.attendees = attendees;
		this.timeSlot = timeSlot;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Attendee> getAtendees() {
		return attendees;
	}

	public void setAtendees(List<Attendee> atendees) {
		this.attendees = atendees;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Time getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(Time timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", atendees=" + attendees + ", room="
				+ room + ", timeSlot=" + timeSlot + "]";
	}

}
