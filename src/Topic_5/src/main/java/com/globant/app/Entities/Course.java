package com.globant.app.Entities;

import com.globant.app.Database.HighSchoolQueries;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Course {

	private static AtomicInteger nextId = new AtomicInteger(0);

	private int id;
	private String name;
	private Teacher teacher;
	private int hoursByWeek;

	public Course(String name, Teacher teacher, int hoursByWeek) {
		this.id = Course.getNextId();
		this.name = name;
		this.teacher = teacher;
		this.hoursByWeek = hoursByWeek;
	}

	public Course(int id, String name, Teacher teacher, int hoursByWeek) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.hoursByWeek = hoursByWeek;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

	private static int getNextId() {
		return nextId.incrementAndGet();
	}

	@Override public String toString() {
		String result = "";

		result += String.format("Course: %s\n", name);

		result += String.format("\tTeacher: %s\n", teacher.toString());

		result += String.format("\tStudents:\n");

		try {
			List<Student> students = HighSchoolQueries.getStudents(this);

			for (Student student : students) {
				result += "\t\t" + student.toString() + "\n";
			}
		} catch (SQLException e) {
			System.out.println("Couldn't retrieve students.");
			e.printStackTrace();
		}

		return result;
	}
}
