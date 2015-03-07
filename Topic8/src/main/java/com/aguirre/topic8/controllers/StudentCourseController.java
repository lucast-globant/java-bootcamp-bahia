package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.StudentCourse;
import com.aguirre.topic8.repositories.StudentCourseDao;
import com.google.gson.Gson;

@ContextConfiguration
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {

	@Autowired
	private StudentCourseDao studentCourseDao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudentCourse(String jsonString) {
		Gson gson = new Gson();
		StudentCourse studentCourse = gson.fromJson(jsonString, StudentCourse.class);
		studentCourseDao.save(studentCourse);
		return gson.toJson(studentCourse);
	}

	@RequestMapping(value = "/delete/{idStudentCourse}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable Long idStudentCourse) {
		StudentCourse studentCourseDeleted = studentCourseDao.findOne(idStudentCourse);
		studentCourseDao.delete(idStudentCourse);
		Gson gson = new Gson();
		return gson.toJson(studentCourseDeleted);
	}

}
