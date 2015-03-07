package com.aguirre.topic8.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.CourseDao;
import com.aguirre.topic8.repositories.StudentCourseDao;
import com.aguirre.topic8.repositories.StudentDao;
import com.google.gson.Gson;

@ContextConfiguration
@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private StudentCourseDao studentCourseDao;

	@Autowired
	private StudentDao studentDao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCourse(String jsonString) {
		Gson gson = new Gson();
		Course course = gson.fromJson(jsonString, Course.class);
		courseDao.save(course);
		return gson.toJson(course);
	}

	@RequestMapping(value = "/delete/{idCourse}", method = RequestMethod.DELETE)
	public String deleteCourse(@PathVariable Long idCourse) {
		Course courseDeleted = courseDao.findOne(idCourse);
		courseDao.delete(idCourse);
		Gson gson = new Gson();
		return gson.toJson(courseDeleted);
	}

	@RequestMapping(value = "/{idCourse}/studentsApprovedStudents", method = RequestMethod.GET)
	public String getApprovedStudentsByCourse(@PathVariable Long idCourse) {
		List<Long> studentsId = studentCourseDao.findStudentsInCourseWithNotesGreatherThan4(idCourse);
		List<Student> students = new ArrayList<Student>();
		for (Long studentId : studentsId) {
			students.add(studentDao.findOne(studentId));
		}
		Gson gson = new Gson();
		return gson.toJson(students);
	}
}
