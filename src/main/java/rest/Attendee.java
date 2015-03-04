package rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attendee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	private Meeting meeting;

	public Attendee(String name) {
		this.name = name;
	}

	public Attendee() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Long getId() {
		return id;
	}

}
