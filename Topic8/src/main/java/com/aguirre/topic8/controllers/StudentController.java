package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.StudentDao;
import com.google.gson.Gson;

@ContextConfiguration
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(String jsonString) {
		Gson gson = new Gson();
		Student student = gson.fromJson(jsonString, Student.class);
		studentDao.save(student);
		return gson.toJson(student);
	}

	@RequestMapping(value = "/delete/{idStudent}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable Long idStudent) {
		Student studentDeleted = studentDao.findOne(idStudent);
		studentDao.delete(idStudent);
		Gson gson = new Gson();
		return gson.toJson(studentDeleted);
	}
	/*
	 * public List<Student> findStudentsInCourseWithNotesGreaterTanFour(String
	 * idCourse) {
	 * 
	 * }
	 */

}
