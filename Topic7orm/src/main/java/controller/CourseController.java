package controller;


import model.Course;
import model.CourseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseDao courseDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name) {
		try {
			Course Course = new Course(name);
			courseDao.save(Course);
		} catch (Exception ex) {
			return "error creating the course: " + ex.toString();
		}
		return "course created";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int id) {
		try {
			Course user = new Course(id);
			courseDao.delete(user);
		} catch (Exception ex) {
			return "error deleting the course:" + ex.toString();
		}
		return "course deleted";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			courseDao.findAll();
		} catch (Exception ex) {
			return "error findall:" + ex.toString();
		}
		return "Courses founded";
	}
}
