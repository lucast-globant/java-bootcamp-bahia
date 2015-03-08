package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import controllers.CourseController;
import data.CourseDao;
import models.Course;

public class CourseServiceImp implements CourseService {

	@Autowired
	CourseDao courseDao;

	@Override
	public Course saveCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course readCourse(Long courseId) {
		return courseDao.findOne(courseId);
	}

	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(Long courseId) {
		courseDao.delete(courseId);
	}

	@Override
	public List<Course> findAll() {
		return courseDao.findAll();
	}

	@Override
	public List<Course> findByTeacherId(Long teacherId) {
		List<Course> courses = new ArrayList<Course>();
		courses = courseDao.findByTeacherId(teacherId);
		return courses;
	}

}
