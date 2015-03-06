package com.globant.app.data.jpa.domain.entities;

public class CourseNote {

	private Course course;
	private int note;

	public CourseNote(Course course, int note) {
		this.course = course;
		this.note = note;
	}

	public Course getCourse() {
		return course;
	}

	public int getNote() {
		return note;
	}
}
