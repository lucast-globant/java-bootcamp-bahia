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
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.services.CourseService;

@ContextConfiguration
@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Course addCourse(String name, Long idTeacher, int hours) {
		try {
			Course course = new Course(name, idTeacher, hours);
			courseService.addCourse(course);
			return course;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/delete/{idCourse}", method = RequestMethod.DELETE)
	@ResponseBody
	public Course deleteCourse(@PathVariable Long idCourse) {
		try {
			Course courseDeleted = courseService.getCourse(idCourse);
			courseService.deleteCourse(courseDeleted);
			return courseDeleted;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/{idCourse}/studentsApprovedStudents", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getApprovedStudentsByCourse(@PathVariable Long idCourse) {
		try {
			List<Student> students = courseService.getStudentIdAprovvedByCourseId(idCourse);
			return students;
		} catch (Exception exception) {
			return null;
		}
	}
}
