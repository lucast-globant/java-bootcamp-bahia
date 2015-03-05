package com.aguirre.topic7.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_course")
	private Long idCourse;

	@NotNull
	@Column(name = "name_course")
	private String courseName;

	@Column(name = "file_number")
	private Long fileNumber;

	@Column(name = "hours_by_week")
	private int hoursByWeek;

	public Course() {
	}

	public Course(String courseName, Long fileNumber, int hoursByWeek) {
		this.courseName = courseName;
		this.fileNumber = fileNumber;
		this.hoursByWeek = hoursByWeek;
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
}
