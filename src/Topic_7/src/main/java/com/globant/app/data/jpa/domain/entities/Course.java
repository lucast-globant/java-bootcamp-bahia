package com.globant.app.data.jpa.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToOne
	private Teacher teacher;

	private int hoursByWeek;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Student> students;

	public Course() {
		students = new ArrayList<Student>();
	}

	public Course(String name, Teacher teacher, int hoursByWeek) {
		this();
		this.name = name;
		this.teacher = teacher;
		this.hoursByWeek = hoursByWeek;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
