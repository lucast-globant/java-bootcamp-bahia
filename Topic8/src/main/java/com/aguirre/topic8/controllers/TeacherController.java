package com.aguirre.topic8.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Teacher;
import com.aguirre.topic8.services.CourseService;
import com.aguirre.topic8.services.TeacherService;

@ContextConfiguration
@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Teacher addTeacher(String firstName, String lastName, String dateOfBirth) {
		try {
			Teacher teacher = new Teacher(firstName, lastName, dateOfBirth);
			teacherService.addTeacher(teacher);
			return teacher;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/delete/{idTeacher}", method = RequestMethod.DELETE)
	@ResponseBody
	public Teacher deleteTeacher(@PathVariable Long idTeacher) {
		try {
			Teacher teacherDeleted = teacherService.getTeacher(idTeacher);
			teacherService.deleteTeacher(teacherDeleted);
			return teacherDeleted;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/{idTeacher}/courses", method = RequestMethod.GET)
	@ResponseBody
	public List<Course> getCoursesNameByTeacherId(@PathVariable Long idTeacher) {
		try {
			return courseService.getCoursesNameByTeacherId(idTeacher);
		} catch (Exception exception) {
			return null;
		}
	}
}
