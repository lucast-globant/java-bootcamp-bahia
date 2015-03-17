package com.aguirre.topic8.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.Course;

@Component
public interface CourseDao extends MongoRepository<Course, Long> {

	@Query("{ fileNumber' : ?0 }")
	public List<Course> findCoursesByTeacherId(@Param("teacherId") Long idTeacher);

}
