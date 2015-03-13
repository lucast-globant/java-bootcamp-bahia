package controllers;

import models.Teacher;
import models.TeacherDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherController {

	@Autowired
	private TeacherDao teacherDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Teacher Teacher = new Teacher(name, lastName);
			teacherDao.save(Teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Teacher created";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Teacher user = new Teacher(id);
			teacherDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the Teacher:" + ex.toString();
		}
		return "Teacher deleted";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			teacherDao.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Teachers founded";
	}

}