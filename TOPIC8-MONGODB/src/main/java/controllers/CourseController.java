package controllers;

import models.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import data.CourseDao;

@Controller
public class CourseController {

	@Autowired
	private CourseDao _CourseDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name) {
		try {
			Course Course = new Course(name);
			_CourseDao.save(Course);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Course succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Course user = new Course(id);
			_CourseDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the Course:" + ex.toString();
		}
		return "Course succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			_CourseDao.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Courses succesfully founded!";
	}
}