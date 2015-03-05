package com.aguirre.topic7.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.topic7.models.Teacher;
import com.aguirre.topic7.models.TeacherDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherDao teacherDao;

	@RequestMapping(method = RequestMethod.POST)
	public String createTeacher(String jsonString) {
		Gson gson = new Gson();
		Teacher teacher = gson.fromJson(jsonString, Teacher.class);
		teacherDao.save(teacher);
		return gson.toJson(teacher);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getTeachers() {
		List<Teacher> teachers = teacherDao.findAll();
		Gson gson = new Gson();
		return gson.toJson(teachers);
	}
}
