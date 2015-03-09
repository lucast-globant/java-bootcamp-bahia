package com.globant.app.data.mongo.repositories;

import com.globant.app.data.mongo.entities.Course;
import com.globant.app.data.mongo.entities.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICourseRepo extends IRepository<Course> {

	List<Course> findByTeacherOrderByNameAsc(Teacher teacher);

}
