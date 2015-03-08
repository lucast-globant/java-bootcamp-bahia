package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Course;

@Service
public interface CourseService {
	public Course saveCourse(Course course);

	public Course readCourse(Long courseId);

	public Course updateCourse(Course course);

	public void deleteCourse(Long courseId);

	public List<Course> findAll();

	public List<Course> findByTeacherId(Long teacherId);
}
