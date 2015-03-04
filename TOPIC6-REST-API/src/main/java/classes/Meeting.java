package classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Meeting {

	@OneToMany(mappedBy = "meeting")
	private List<Attendee> attendees;

	@ManyToOne
	private Room room;

	@Id
	@GeneratedValue
	private Long id;

	Meeting() { // jpa only
	}

	public Meeting(Room room, List<Attendee> attendees, String slot, String uri, String description) {
		this.uri = uri;
		this.description = description;
		this.attendees = attendees;
		this.slot = slot;
	}

	public String uri;
	public String description;
	private String slot;

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

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public Long getId() {
		return id;
	}

	public String getUri() {
		return uri;
	}

	public String getDescription() {
		return description;
	}
}
