package com.aguirre.topic8.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Student;

@Service
public interface CourseService {

	public void addCourse(Course course);
	
	public void deleteCourse(Course course);
	
	public Course getCourse(Long idCourse);
	
	public List<Course> getCoursesNameByTeacherId(Long idTeacher);
	
	public List<Student> getStudentIdAprovvedByCourseId(Long idCourse);
}
