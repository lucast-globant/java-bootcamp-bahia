package com.globant.app.data.mongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Student {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String schoolId;
	private Date dateOfBirth;

	private List<CourseNote> coursesNotes;

	public Student() {
		coursesNotes = new ArrayList<CourseNote>();
	}

	public Student(String firstName, String lastName, String schoolId, Date dateOfBirth){
		this();

		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolId = schoolId;
		this.dateOfBirth = dateOfBirth;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override public String toString() {
		return String.format("%s %s, %s", id, lastName, firstName);
	}

	public List<CourseNote> getCoursesNotes() {
		return coursesNotes;
	}

	public void setCoursesNotes(List<CourseNote> coursesNotes) {
		this.coursesNotes = coursesNotes;
	}
}
