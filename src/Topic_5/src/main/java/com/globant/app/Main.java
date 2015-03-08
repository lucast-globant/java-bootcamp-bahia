package com.globant.app;

import com.globant.app.Database.HighSchoolDb;
import com.globant.app.Entities.Course;
import com.globant.app.Entities.Student;
import com.globant.app.Entities.Teacher;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {

	private static Student[] students = new Student[100];
	private static Teacher[] teachers = new Teacher[3];
	private static Course[] courses = new Course[5];

	public static void main(String[] args) throws SQLException, IOException, URISyntaxException {

		HighSchoolDb highSchoolDb = new HighSchoolDb();

		seedDatabase(highSchoolDb);

		Random random = new Random();

		// Print three courses
		for (int i = 0; i < 3; i++) {
			Course course = courses[random.nextInt(courses.length)];

			System.out.println(course.toString());
		}

		// Print three students' academic history
		for (int i = 0; i < 3; i++) {
			Student student = highSchoolDb.getStudent(random.nextInt(students.length));

			System.out.println(student.getAcademicHistory());
		}

	}

	private static void seedDatabase(HighSchoolDb highSchoolDb) throws SQLException {

		Calendar calendar = Calendar.getInstance();
		calendar.set(7, Calendar.NOVEMBER, 1990);
		Date dateOfBirth = calendar.getTime();

		Random random = new Random(6);

		// Add students
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(
					"FirstName " + i,
					"Last name " + i,
					String.valueOf(i),
					dateOfBirth
			);

			highSchoolDb.addStudent(students[i]);
		}

		// Add teachers
		for (int i = 0; i < teachers.length; i++) {
			teachers[i] = new Teacher(
					"FirstName " + i,
					"Last name " + i,
					dateOfBirth
			);

			highSchoolDb.addTeacher(teachers[i]);
		}

		// Add courses
		for (int i = 0; i < courses.length; i++) {
			courses[i] = new Course(
					"Course" + i,
					teachers[i % teachers.length],
					random.nextInt(9) + 1
			);

			highSchoolDb.addCourse(courses[i]);
		}

		// Add students to courses
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			highSchoolDb.addStudentToCourse(
					student,
					courses[i % courses.length],
					random.nextInt(6) + 4
			);
		}

	}
}
