package com.globant.app.data.mongo.services;

import com.globant.app.data.mongo.entities.Course;
import com.globant.app.data.mongo.entities.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICourseService {

	Course addCourse(Course course);

	List<Course> findByTeacherOrderByNameAsc(Teacher teacher);
}
