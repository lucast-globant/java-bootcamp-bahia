package key_two;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attendee {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@ManyToOne
	private Meeting meeting;

	public Attendee(String name) {
		this.name = name;
	}

	public Attendee() {

	}

	public Attendee(String name, Meeting meeting) {
		this.name = name;
		this.meeting = meeting;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

}
