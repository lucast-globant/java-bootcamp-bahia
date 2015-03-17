package com.aguirre.topic8.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.CourseDao;
import com.aguirre.topic8.repositories.StudentCourseDao;

public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private StudentCourseDao studentCourseDao;

	@Override
	public void addCourse(Course course) {
		courseDao.save(course);
	}

	@Override
	public void deleteCourse(Course course) {
		courseDao.delete(course);
	}

	@Override
	public Course getCourse(Long idCourse) {
		return courseDao.findOne(idCourse);
	}

	@Override
	public List<Course> getCoursesNameByTeacherId(Long idTeacher) {
		return courseDao.findCoursesByTeacherId(idTeacher);
	}

	@Override
	public List<Student> getStudentIdAprovvedByCourseId(Long idCourse) {
		return studentCourseDao.findStudentsInCourseWithNotesGreatherThan4(idCourse);
	}
}
