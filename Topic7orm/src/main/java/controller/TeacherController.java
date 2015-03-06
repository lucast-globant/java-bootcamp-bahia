package controller;


import model.Teacher;
import model.TeacherDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
			return "error create teacher: " + ex.toString();
		}
		return "teacher created";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Teacher user = new Teacher(id);
			teacherDao.delete(user);
		} catch (Exception ex) {
			return "error delete teacher: " + ex.toString();
		}
		return "teacher deleted";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			teacherDao.findAll();
		} catch (Exception ex) {
			return "error findall teachers: " + ex.toString();
		}
		return "teachers founded";
	}

}