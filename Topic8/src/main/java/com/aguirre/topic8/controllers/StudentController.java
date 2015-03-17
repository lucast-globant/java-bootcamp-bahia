package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.services.StudentService;

@ContextConfiguration
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Student addStudent(String firstName, String lastName, String dateOfBirth) {
		try {
			Student student = new Student(firstName, lastName, dateOfBirth);
			studentService.addStudent(student);
			return student;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/delete/{idStudent}", method = RequestMethod.DELETE)
	@ResponseBody
	public Student deleteStudent(@PathVariable Long idStudent) {
		try {
			Student studentDeleted = studentService.getStudent(idStudent);
			studentService.deleteStudent(studentDeleted);
			return studentDeleted;
		} catch (Exception exception) {
			return null;
		}
	}
}
