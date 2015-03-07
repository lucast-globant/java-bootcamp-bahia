package com.aguirre.topic8.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ScheduleTime {

	@Id
	private Long id;
	private int idCourse;
	private String nameOfDay;
	private String startTime;
	private String endTime;

	public ScheduleTime(int idCourse, String nameOfDay, String startTime, String endTime) {
		this.idCourse = idCourse;
		this.nameOfDay = nameOfDay;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public String getNameOfDay() {
		return nameOfDay;
	}

	public void setNameOfDay(String nameOfDay) {
		this.nameOfDay = nameOfDay;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
