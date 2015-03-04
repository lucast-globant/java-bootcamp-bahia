package com.globant.app.actuator.domain.entities;

public class Attendee extends Identifiable {

	private String firstName;
	private String lastName;

	public Attendee() {
	}

	public Attendee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
