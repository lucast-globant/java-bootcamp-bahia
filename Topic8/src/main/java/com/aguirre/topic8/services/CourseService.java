package com.aguirre.topic8.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.CourseDao;
import com.aguirre.topic8.repositories.StudentCourseDao;

@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private StudentCourseDao studentCourseDao;

	public void addCourse(Course course) {
		courseDao.save(course);
	}

	public void deleteCourse(Course course) {
		courseDao.delete(course);
	}

	public Course getCourse(Long idCourse) {
		return courseDao.findOne(idCourse);
	}

	public List<Course> getCoursesNameByTeacherId(Long idTeacher) {
		return courseDao.findCoursesByTeacherId(idTeacher);
	}

	public List<Student> getStudentIdAprovvedByCourseId(Long idCourse) {
		return studentCourseDao.findStudentsInCourseWithNotesGreatherThan4(idCourse);
	}
}
