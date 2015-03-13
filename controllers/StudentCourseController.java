package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import models.StudentCourseDao;
import models.Student;
import models.Course;

@Controller
public class StudentCourseController {
	
	@Autowired
	private StudentCourseDao studentCourseDao;
	
	@RequestMapping("/fetchCoursesByStudent")
	@ResponseBody
	public List<Course> findCoursesByStudent (long studentId){
		return studentCourseDao.findCoursesByStudent(studentId);

	}
	
	@RequestMapping("/fetchStudentsByCourse")
	@ResponseBody
	public List<Student> findStudentsByCourse (long courseId){
		return studentCourseDao.findStudentsByCourse(courseId);
	}

}
