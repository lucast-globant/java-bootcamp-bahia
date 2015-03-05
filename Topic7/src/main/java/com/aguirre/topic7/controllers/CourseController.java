package com.aguirre.topic7.controllers;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aguirre.topic7.models.Course;
import com.aguirre.topic7.models.CourseDao;
import com.aguirre.topic7.models.Student;
import com.aguirre.topic7.models.StudentCourseDao;
import com.google.gson.Gson;

@Entity
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseDao courseDao;
	private StudentCourseDao studentCourseDao;

	@RequestMapping(method = RequestMethod.POST)
	public String createCourse(String jsonString) {
		Gson gson = new Gson();
		Course course = gson.fromJson(jsonString, Course.class);
		courseDao.save(course);
		return gson.toJson(course);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getCourses() {
		List<Course> courses = courseDao.findAll();
		Gson gson = new Gson();
		return gson.toJson(courses);
	}

	@RequestMapping(value = "/{idCourse}/students", method = RequestMethod.GET)
	public String getStudentsCourse(@PathVariable Long idCourse) {
		List<Student> students = studentCourseDao.findStudentsByIdCourse(idCourse);
		Gson gson = new Gson();
		return gson.toJson(students);
	}

}
