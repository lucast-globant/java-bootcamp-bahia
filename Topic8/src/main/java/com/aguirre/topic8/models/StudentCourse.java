package com.aguirre.topic8.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentCourses")
public class StudentCourse {

	@Id
	private Long id;
	private int registrationNumber;
	private int idCourse;
	private Integer note1;
	private Integer note2;
	private Integer note3;
	private Integer finalNote;

	public StudentCourse(int registrationNumber, int idCourse, Integer note1, Integer note2, Integer note3, Integer finalNote) {
		this.registrationNumber = registrationNumber;
		this.idCourse = idCourse;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		this.finalNote = finalNote;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public Integer getNote1() {
		return note1;
	}

	public void setNote1(Integer note1) {
		this.note1 = note1;
	}

	public Integer getNote2() {
		return note2;
	}

	public void setNote2(Integer note2) {
		this.note2 = note2;
	}

	public Integer getNote3() {
		return note3;
	}

	public void setNote3(Integer note3) {
		this.note3 = note3;
	}

	public Integer getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(Integer finalNote) {
		this.finalNote = finalNote;
	}
}
