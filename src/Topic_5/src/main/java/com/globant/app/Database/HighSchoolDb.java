package com.globant.app.Database;

import com.globant.app.Entities.Course;
import com.globant.app.Entities.Student;
import com.globant.app.Entities.Teacher;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HighSchoolDb {

	private Connection connection;
	private HighSchoolUpdates highSchoolUpdates;

	public HighSchoolDb() throws SQLException, IOException, URISyntaxException {
		this.connection = new DbConfig().getConnection();

		HighSchoolQueries.setConnection(connection);

		this.highSchoolUpdates = new HighSchoolUpdates(connection);

		initialize();
	}

	private void initialize() throws SQLException, URISyntaxException, IOException {
		Path filePath = Paths.get(getClass().getClassLoader().getResource("DatabaseScheme.sql").toURI());

		String fileData = new String(Files.readAllBytes(filePath), "UTF-8");

		fileData = fileData.replace("\n", "");

		String[] statements = fileData.split(";");

		for (String statementString : statements) {
			Statement statement = connection.createStatement();

			statement.execute(statementString);
		}
	}

	public void addStudent(Student student) throws SQLException {
		highSchoolUpdates.addStudent(student);
	}

	public void addTeacher(Teacher teacher) throws SQLException {
		highSchoolUpdates.addTeacher(teacher);
	}

	public void addCourse(Course course) throws SQLException {
		highSchoolUpdates.addCourse(course);
	}

	public void addStudentToCourse(Student student, Course course, int finalNote) throws SQLException {
		highSchoolUpdates.addStudentToCourse(student, course, finalNote);
	}

	public Student getStudent(int id) throws SQLException {
		return HighSchoolQueries.getStudent(id);
	}
}
