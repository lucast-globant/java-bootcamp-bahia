package com.globant.app.Database;

import com.globant.app.Entities.Course;
import com.globant.app.Entities.CourseNote;
import com.globant.app.Entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HighSchoolQueries {

	private static Connection connection;
	private static HighSchoolPreparedStatements highSchoolPreparedStatements;

	public static void setConnection(Connection connection) throws SQLException {
		HighSchoolQueries.connection = connection;
		highSchoolPreparedStatements = new HighSchoolPreparedStatements(connection);
	}

	public static Student getStudent(int id) throws SQLException {
		PreparedStatement getStudentStatement = highSchoolPreparedStatements.getGetStudentStatement();

		getStudentStatement.setInt(1, id);

		ResultSet resultSet = getStudentStatement.executeQuery();
		resultSet.next();

		return getStudentFromResultSet(resultSet);
	}

	public static List<Student> getStudents(Course course) throws SQLException {

		PreparedStatement getStudents = connection.prepareStatement("" +
				"SELECT * FROM (" +
				"	SELECT student_id AS id FROM courses_students WHERE course_id = ?" +
				") AS student_ids NATURAL JOIN students ORDER BY first_name DESC ");

		getStudents.setInt(1, course.getId());

		ResultSet resultSet = getStudents.executeQuery();

		List<Student> students = new ArrayList<Student>();

		while (resultSet.next())
			students.add(getStudentFromResultSet(resultSet));

		return students;
	}

	public static List<CourseNote> getCoursesNotes(Student student) throws SQLException {

		PreparedStatement getCoursesNotes = connection.prepareStatement("" +
						"SELECT * FROM(" +
						"SELECT course_id AS id, final_exam FROM courses_students WHERE student_id = ?" +
						") AS course_with_note NATURAL JOIN courses ORDER BY final_exam DESC, name DESC"
		);

		getCoursesNotes.setInt(1, student.getId());

		ResultSet resultSet = getCoursesNotes.executeQuery();

		List<CourseNote> courseNotes = new ArrayList<CourseNote>();

		while (resultSet.next())
			courseNotes.add(getCourseNoteFromResultSet(resultSet));

		return courseNotes;
	}

	private static CourseNote getCourseNoteFromResultSet(ResultSet resultSet) throws SQLException {
		int id;
		String name;
		int hoursByWeek;
		int final_exam;

		id = resultSet.getInt("id");
		name = resultSet.getString("name");
		hoursByWeek = resultSet.getInt("hours_by_week");
		final_exam = resultSet.getInt("final_exam");

		return new CourseNote(new Course(id, name, null, hoursByWeek), final_exam);
	}

	private static Student getStudentFromResultSet(ResultSet resultSet) throws SQLException {
		int id;
		String firstName, lastName, schoolId;
		Date birthDate;

		id = resultSet.getInt("id");
		firstName = resultSet.getString("first_name");
		lastName = resultSet.getString("last_name");
		schoolId = resultSet.getString("school_id");
		birthDate = resultSet.getDate("date_of_birth");

		return new Student(id, firstName, lastName, schoolId, birthDate);
	}
}
