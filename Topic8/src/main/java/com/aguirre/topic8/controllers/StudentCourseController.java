package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.StudentCourse;
import com.aguirre.topic8.services.StudentCourseService;

@ContextConfiguration
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {

	@Autowired
	private StudentCourseService studentCourseService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public StudentCourse addStudentCourse(int registrationNumber, int idCourse, Integer note1, Integer note2, Integer note3, Integer finalNote) {
		try {
			StudentCourse studentCourse = new StudentCourse(registrationNumber, idCourse, note1, note2, note3, finalNote);
			studentCourseService.addStudentCourse(studentCourse);
			return studentCourse;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/delete/{idStudentCourse}", method = RequestMethod.DELETE)
	@ResponseBody
	public StudentCourse deleteStudent(@PathVariable Long idStudentCourse) {
		try {
			StudentCourse studentCourseDeleted = studentCourseService.getStudentCourse(idStudentCourse);
			studentCourseService.deleteStudentCourse(studentCourseDeleted);
			return studentCourseDeleted;
		} catch (Exception exception) {
			return null;
		}
	}
}
