package com.globant.app.Database;

import com.globant.app.Entities.Course;
import com.globant.app.Entities.Student;
import com.globant.app.Entities.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HighSchoolUpdates {

	private HighSchoolPreparedStatements highSchoolPreparedStatements;

	public HighSchoolUpdates(Connection connection) throws SQLException {
		highSchoolPreparedStatements = new HighSchoolPreparedStatements(connection);
	}


	public void addStudent(Student student) throws SQLException {
		PreparedStatement addStudent;

		addStudent = highSchoolPreparedStatements.getAddStudentStatement();

		// Add values
		addStudent.setInt(1, student.getId());
		addStudent.setString(2, student.getFirstName());
		addStudent.setString(3, student.getLastName());
		addStudent.setString(4, student.getSchoolId());
		addStudent.setDate(5, new java.sql.Date(student.getDateOfBirth().getTime()));

		addStudent.execute();
	}

	public void addTeacher(Teacher teacher) throws SQLException {
		PreparedStatement addTeacher;

		addTeacher = highSchoolPreparedStatements.getAddTeacherStatement();

		// Add values
		addTeacher.setInt(1, teacher.getId());
		addTeacher.setString(2, teacher.getFirstName());
		addTeacher.setString(3, teacher.getLastName());
		addTeacher.setDate(4, new java.sql.Date(teacher.getDateOfBirth().getTime()));

		addTeacher.execute();
	}

	public void addCourse(Course course) throws SQLException {
		PreparedStatement addCourse;

		addCourse = highSchoolPreparedStatements.getAddCourseStatement();

		// Add values
		addCourse.setInt(1, course.getId());
		addCourse.setString(2, course.getName());
		addCourse.setNull(3, course.getTeacher().getId());
		addCourse.setInt(4, course.getHoursByWeek());

		addCourse.execute();
	}

	public void addStudentToCourse(Student student, Course course, int finalNote) throws SQLException {
		PreparedStatement addToCourse = highSchoolPreparedStatements.getAddStudentToCourseStatement();

		addToCourse.setInt(1, course.getId());
		addToCourse.setInt(2, student.getId());
		addToCourse.setInt(3, finalNote);

		addToCourse.execute();
	}
}
