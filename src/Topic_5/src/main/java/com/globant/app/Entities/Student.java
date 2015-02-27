package com.globant.app.Entities;

import com.globant.app.Database.HighSchoolQueries;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {

	private static AtomicInteger nextId = new AtomicInteger(0);

	private int id;
	private String firstName;
	private String lastName;
	private String schoolId;
	private Date dateOfBirth;

	public Student(int id, String firstName, String lastName, String schoolId, Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolId = schoolId;
		this.dateOfBirth = dateOfBirth;
	}

	public Student(String firstName, String lastName, String schoolId, Date dateOfBirth){
		this.id = Student.getNextId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolId = schoolId;
		this.dateOfBirth = dateOfBirth;
	}

	private static int getNextId(){
		return nextId.incrementAndGet();
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

	public int getId() {
		return id;
	}

	@Override public String toString() {
		return String.format("%s, %s", lastName, firstName);
	}

	public String getAcademicHistory() {
		String result = null;
		try {
			result = String.format("Academic history of %s\n\t%-15s\tNota\n", toString(), "Materia");

			List<CourseNote> coursesNotes = HighSchoolQueries.getCoursesNotes(this);

			for (CourseNote coursesNote : coursesNotes) {
				result += String.format("\t%-15s\t%d\n", coursesNote.getCourse().getName(), coursesNote.getNote());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
