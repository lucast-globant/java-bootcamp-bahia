package com.aguirre.topic6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attendee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String lastName;

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

	public String getLastName() {
		return lastName;
	}
}
