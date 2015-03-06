package com.globant.app.data.jpa.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String schoolId;
	private Date dateOfBirth;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Course> courses;

	public Student() {
		courses = new ArrayList<Course>();
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

	public Long getId() {
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
		return String.format("%s, %s", lastName, firstName);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
