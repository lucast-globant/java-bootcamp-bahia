package topic6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attendee {
	@Id
	@GeneratedValue
	private Long id;
	private String name, lastName;

	public Attendee() {
	}

	public Attendee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
