package com.aguirre.topic7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic7.models.StudentCourse;
import com.aguirre.topic7.models.StudentCourseDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/student_course")
public class StudentCourseController {

	@Autowired
	private StudentCourseDao studentCourseDao;

	@RequestMapping(method = RequestMethod.POST)
	public String addStudentCourse(String jsonString) {
		Gson gson = new Gson();
		StudentCourse studentCourse = gson.fromJson(jsonString, StudentCourse.class);
		studentCourseDao.save(studentCourse);
		return gson.toJson(studentCourse);
	}
}
