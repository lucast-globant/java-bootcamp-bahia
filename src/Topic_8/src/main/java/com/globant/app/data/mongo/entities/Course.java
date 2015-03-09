package com.globant.app.data.mongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Course {

	@Id
	private String id;

	private String name;

	private Teacher teacher;

	private int hoursByWeek;

	private List<CourseNote> studentsNotes;

	private boolean finished = false;

	public Course() {
		studentsNotes = new ArrayList<CourseNote>();
	}

	public Course(String name, Teacher teacher, int hoursByWeek) {
		this();
		this.name = name;
		this.teacher = teacher;
		this.hoursByWeek = hoursByWeek;
	}

	public String getId() {
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

	public List<CourseNote> getStudentsNotes() {
		return studentsNotes;
	}

	public void setStudentsNotes(List<CourseNote> studentsNotes) {
		this.studentsNotes = studentsNotes;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override public String toString() {
		return String.format("%s\t\t%s\t\t%d", name, teacher.toString(), hoursByWeek);
	}
}