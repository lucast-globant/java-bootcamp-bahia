package com.globant.app.data.mongo.services.implementation;

import com.globant.app.data.mongo.entities.Course;
import com.globant.app.data.mongo.entities.Teacher;
import com.globant.app.data.mongo.repositories.ICourseRepo;
import com.globant.app.data.mongo.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseService implements ICourseService {

	@Autowired
	private ICourseRepo courseRepo;

	@Override public Course addCourse(Course course) {
		return courseRepo.save(course);
	}

	@Override public List<Course> findByTeacherOrderByNameAsc(Teacher teacher) {
		return courseRepo.findByTeacherOrderByNameAsc(teacher);
	}
}
