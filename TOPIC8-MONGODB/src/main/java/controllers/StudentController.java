package controllers;

import models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import services.StudentService;
import data.StudentDao;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Student student = new Student(name, lastName);
			studentService.saveStudent(student);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long studentId) {
		try {
			studentService.deleteStudent(studentId);
		} catch (Exception ex) {
			return "Error deleting the student:" + ex.toString();
		}
		return "Student succesfully deleted!";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			studentService.findAll();
		} catch (Exception ex) {
			return "Error finding:" + ex.toString();
		}
		return "Students succesfully founded!";
	}

}