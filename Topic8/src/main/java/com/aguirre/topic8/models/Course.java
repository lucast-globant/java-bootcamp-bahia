package com.aguirre.topic8.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {

	@Id
	private Long idCourse;
	private String courseName;
	private Long fileNumber;
	private int hoursByWeek;
	private boolean isFinished;

	public Course(String courseName, Long fileNumber, int hoursByWeek) {
		this.courseName = courseName;
		this.fileNumber = fileNumber;
		this.hoursByWeek = hoursByWeek;
		this.isFinished = false;
	}

	public Long getCourseId() {
		return idCourse;
	}

	public void setCourse(Long id) {
		this.idCourse = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(Long fileNumber) {
		this.fileNumber = fileNumber;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public String toString() {
		return "Course name: " + courseName + "Course id: " + idCourse + " " + " Teacher id: " + fileNumber + " Hours by week: "
				+ hoursByWeek;
	}
	
	public void finishCourse() {
		this.isFinished = true;
	}
	
	public boolean isFinished() {
		return isFinished;
	}
}
