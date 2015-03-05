package controllers;

import models.Student;
import models.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@Autowired
	private StudentDao _studentDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Student student = new Student(name, lastName);
			_studentDao.save(student);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Student user = new Student(id);
			_studentDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the student:" + ex.toString();
		}
		return "Student succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			_studentDao.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Students succesfully founded!";
	}

}