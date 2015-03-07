package com.aguirre.topic8.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.Course;

@Component
public interface CourseDao extends MongoRepository<Course, Long> {

	@Query(value = "{ fileNumber' : ?0 }", fields = "{ courseName : 1 }")
	public List<String> findCoursesByTeacherId(@Param("teacherId") Long idTeacher);

}
