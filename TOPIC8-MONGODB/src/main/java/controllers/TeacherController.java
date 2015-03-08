package controllers;

import models.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import data.TeacherDao;

@Controller
public class TeacherController {

	@Autowired
	private TeacherDao _TeacherDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Teacher Teacher = new Teacher(name, lastName);
			_TeacherDao.save(Teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Teacher succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Teacher user = new Teacher(id);
			_TeacherDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the Teacher:" + ex.toString();
		}
		return "Teacher succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			_TeacherDao.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Teachers succesfully founded!";
	}

}