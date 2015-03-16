package controllers;

import models.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import services.TeacherService;
import data.TeacherDao;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Teacher teacher = new Teacher(name, lastName);
			teacherService.saveTeacher(teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Teacher succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long teacherId) {
		try {
			teacherService.deleteTeacher(teacherId);
		} catch (Exception ex) {
			return "Error deleting the Teacher:" + ex.toString();
		}
		return "Teacher succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			teacherService.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Teachers succesfully founded!";
	}

}