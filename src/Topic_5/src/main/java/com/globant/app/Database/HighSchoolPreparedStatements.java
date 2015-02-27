package com.globant.app.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HighSchoolPreparedStatements {

	private Connection connection;
	private PreparedStatement addStudentStatement;
	private PreparedStatement addTeacherStatement;
	private PreparedStatement addCourseStatement;
	private PreparedStatement addStudentToCourseStatement;
	private PreparedStatement getStudentStatement;

	public HighSchoolPreparedStatements(Connection connection) throws SQLException {
		this.connection = connection;

		prepareStatements();
	}

	public void prepareStatements() throws SQLException {
		addStudentStatement = connection.prepareStatement("INSERT INTO students " +
				"(id, first_name, last_name, school_id, date_of_birth) VALUES(?, ?, ?, ?, ?)");

		addTeacherStatement = connection.prepareStatement("INSERT INTO teachers " +
				"(id, first_name, last_name, date_of_birth) VALUES(?, ?, ?, ?)");

		addCourseStatement = connection.prepareStatement("INSERT INTO courses " +
				"(id, name, teacher_id, hours_by_week) VALUES(?, ?, ?, ?)");

		addStudentToCourseStatement = connection.prepareStatement(
				"insert into courses_students (course_id, student_id, final_exam) values(?, ?, ?)"
		);

		getStudentStatement = connection.prepareStatement(
				"SELECT * FROM students WHERE id = ?"
		);
	}

	public PreparedStatement getAddTeacherStatement() {
		return addTeacherStatement;
	}

	public PreparedStatement getAddCourseStatement() {
		return addCourseStatement;
	}

	public PreparedStatement getAddStudentToCourseStatement() {
		return addStudentToCourseStatement;
	}

	public PreparedStatement getAddStudentStatement() {
		return addStudentStatement;
	}

	public PreparedStatement getGetStudentStatement() {
		return getStudentStatement;
	}
}
