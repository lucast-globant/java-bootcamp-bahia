package controller;


import model.Student;
import model.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, String lastName) {
		try {
			Student student = new Student(name, lastName);
			studentDao.save(student);
		} catch (Exception ex) {
			return "error creating the student: " + ex.toString();
		}
		return "student created";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Student user = new Student(id);
			studentDao.delete(user);
		} catch (Exception ex) {
			return "error deleting the student:" + ex.toString();
		}
		return "student deleted";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll() {
		try {
			studentDao.findAll();
		} catch (Exception ex) {
			return "error findall:" + ex.toString();
		}
		return "students founded";
	}

}