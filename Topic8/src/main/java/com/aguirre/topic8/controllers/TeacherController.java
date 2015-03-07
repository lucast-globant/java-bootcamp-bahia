package com.aguirre.topic8.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.Teacher;
import com.aguirre.topic8.repositories.CourseDao;
import com.aguirre.topic8.repositories.TeacherDao;
import com.google.gson.Gson;

@ContextConfiguration
@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherDao teacherDao;

	@Autowired
	private CourseDao courseDao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addTeacher(String jsonString) {
		Gson gson = new Gson();
		Teacher teacher = gson.fromJson(jsonString, Teacher.class);
		teacherDao.save(teacher);
		return gson.toJson(teacher);
	}

	@RequestMapping(value = "/delete/{idTeacher}", method = RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable Long idTeacher) {
		Teacher teacherDeleted = teacherDao.findOne(idTeacher);
		teacherDao.delete(idTeacher);
		Gson gson = new Gson();
		return gson.toJson(teacherDeleted);
	}

	@RequestMapping(value = "/{idTeacher}/courses", method = RequestMethod.GET)
	public String getCoursesByTeacherId(@PathVariable Long teacherId) {
		List<String> courses = courseDao.findCoursesByTeacherId(teacherId);
		Gson gson = new Gson();
		return gson.toJson(courses);
	}
}
