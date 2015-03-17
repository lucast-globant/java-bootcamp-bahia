package com.aguirre.topic8.services;

import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.StudentCourse;

@Service
public interface StudentCourseService {

	public void addStudentCourse(StudentCourse studentCourse);

	public void deleteStudentCourse(StudentCourse studentCourse);

	public StudentCourse getStudentCourse(Long idStudentCourse);
}
