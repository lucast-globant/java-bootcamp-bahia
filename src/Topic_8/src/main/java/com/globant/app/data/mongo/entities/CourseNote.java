package com.globant.app.data.mongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CourseNote {

	@Id
	private String id;

	private String courseId;

	private String studentId;

	private int firstPartialNote;
	private int secondPartialNote;
	private int thirdPartialNote;
	private int finalNote;

	public CourseNote() {
	}

	public CourseNote(String studentId, String courseId, int firstPartialNote, int secondPartialNote, int thirdPartialNote, int finalNote) {
		this.studentId = studentId;
		this.courseId = courseId;
		this.firstPartialNote = firstPartialNote;
		this.secondPartialNote = secondPartialNote;
		this.thirdPartialNote = thirdPartialNote;
		this.finalNote = finalNote;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getFirstPartialNote() {
		return firstPartialNote;
	}

	public void setFirstPartialNote(int firstPartialNote) {
		this.firstPartialNote = firstPartialNote;
	}

	public int getSecondPartialNote() {
		return secondPartialNote;
	}

	public void setSecondPartialNote(int secondPartialNote) {
		this.secondPartialNote = secondPartialNote;
	}

	public int getThirdPartialNote() {
		return thirdPartialNote;
	}

	public void setThirdPartialNote(int thirdPartialNote) {
		this.thirdPartialNote = thirdPartialNote;
	}

	public int getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
