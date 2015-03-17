package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.aguirre.topic8.models.StudentCourse;
import com.aguirre.topic8.repositories.StudentCourseDao;

public class StudentCourseServiceImp implements StudentCourseService {

	@Autowired
	private StudentCourseDao studentCourseDao;

	@Override
	public void addStudentCourse(StudentCourse studentCourse) {
		studentCourseDao.save(studentCourse);
	}

	@Override
	public void deleteStudentCourse(StudentCourse studentCourse) {
		studentCourseDao.delete(studentCourse);
	}

	@Override
	public StudentCourse getStudentCourse(Long idStudentCourse) {
		return studentCourseDao.findOne(idStudentCourse);
	}
}
