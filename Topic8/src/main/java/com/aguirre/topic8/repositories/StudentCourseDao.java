package com.aguirre.topic8.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.StudentCourse;

@Component
public interface StudentCourseDao extends MongoRepository<StudentCourse, Long> {

	@Query(value = "{ 'idCourse' : ?0, 'finalNote': { $gt : 4 } }", fields = "{'registrationNumber' : 1}")
	public List<Long> findStudentsInCourseWithNotesGreatherThan4(Long idCourse);
}
