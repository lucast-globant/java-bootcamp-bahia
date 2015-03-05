package com.aguirre.topic7.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic7.models.Course;
import com.aguirre.topic7.models.Student;
import com.aguirre.topic7.models.StudentCourseDao;
import com.aguirre.topic7.models.StudentDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	private StudentCourseDao studentCourseDao;

	@RequestMapping(method = RequestMethod.POST)
	public String createStudent(String jsonString) {
		Gson gson = new Gson();
		Student student = gson.fromJson(jsonString, Student.class);
		studentDao.save(student);
		return gson.toJson(student);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getStudents() {
		List<Student> students = studentDao.findAll();
		Gson gson = new Gson();
		return gson.toJson(students);
	}

	@RequestMapping(value = "/{studentId}/courses", method = RequestMethod.GET)
	public String getCoursesStudent(@PathVariable Long studentId) {
		List<Course> courses = studentCourseDao.findCoursesByRegistrationNumber(studentId);
		Gson gson = new Gson();
		return gson.toJson(courses);
	}

}
