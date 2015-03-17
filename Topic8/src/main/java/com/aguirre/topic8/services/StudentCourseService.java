package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.StudentCourse;
import com.aguirre.topic8.repositories.StudentCourseDao;

@Service
public class StudentCourseService {

	@Autowired
	private StudentCourseDao studentCourseDao;

	public void addStudentCourse(StudentCourse studentCourse) {
		studentCourseDao.save(studentCourse);
	}

	public void deleteStudentCourse(StudentCourse studentCourse) {
		studentCourseDao.delete(studentCourse);
	}

	public StudentCourse getStudentCourse(Long idStudentCourse) {
		return studentCourseDao.findOne(idStudentCourse);
	}
}
