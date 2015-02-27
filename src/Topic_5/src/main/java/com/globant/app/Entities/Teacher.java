package com.globant.app.Entities;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Teacher {

	private static AtomicInteger nextId = new AtomicInteger(0);

	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	public Teacher(int id, String firstName, String lastName, Date dateOfBirth){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Teacher(String firstName, String lastName, Date dateOfBirth){
		this.id = Teacher.getNextId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	private static int getNextId(){
		return nextId.incrementAndGet();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getId() {
		return id;
	}

	@Override public String toString() {
		return String.format("%s, %s", lastName, firstName);
	}
}

