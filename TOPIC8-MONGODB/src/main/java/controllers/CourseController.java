package controllers;

import models.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import services.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name) {
		try {
			Course Course = new Course(name);
			courseService.saveCourse(Course);
		} catch (Exception ex) {
			return "Error creating the course: " + ex.toString();
		}
		return "Course succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id) {
		try {
			courseService.deleteCourse(id);
		} catch (Exception ex) {
			return "Error deleting the course:" + ex.toString();
		}
		return "Course succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			courseService.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Courses succesfully founded!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findByTeacherId(Long teacherId) {
		try {
			courseService.findByTeacherId(teacherId);
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Courses succesfully founded!";
	}
}