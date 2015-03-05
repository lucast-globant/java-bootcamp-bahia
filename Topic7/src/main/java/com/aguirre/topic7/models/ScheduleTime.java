package com.aguirre.topic7.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Schedule_Time")
public class ScheduleTime {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int idCourse;
	@NotNull
	private String nameOfDay;
	@NotNull
	private String startTime;
	@NotNull
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
