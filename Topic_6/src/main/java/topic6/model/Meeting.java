package topic6.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Meeting {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	private List<Attendee> attendees;
	@ManyToOne
	private Room room;
	private String initDate, finalDate;
	
	
	public Meeting(){}
	
	public Meeting(Room room, List<Attendee> attendees, String initDate, String finalDate){
		this.attendees = attendees;
		this.room = room;
		this.initDate = initDate;
		this.finalDate = finalDate;
	}
	
	public Long getId() {
		return id;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}
	
	public void addAttendee(Attendee attendee){
		attendees.add(attendee);
	}
	
	public void removeAttendee(Attendee attendee){
		attendees.remove(attendee);
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getInitDate() {
		return initDate;
	}

	public void setInitDate(String initDate) {
		this.initDate = initDate;
	}

	public String getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	
	

		
	
}
