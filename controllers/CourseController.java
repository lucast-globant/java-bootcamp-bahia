package controllers;

import models.Course;
import models.CourseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
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
			return "Error creating the user: " + ex.toString();
		}
		return "Course created";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Course user = new Course(id);
			courseDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the Course:" + ex.toString();
		}
		return "Course deleted";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			courseDao.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Courses founded";
	}
}
