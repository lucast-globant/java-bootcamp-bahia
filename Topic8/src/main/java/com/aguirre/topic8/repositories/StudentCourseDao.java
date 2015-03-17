package com.aguirre.topic8.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.models.StudentCourse;

@Component
public interface StudentCourseDao extends MongoRepository<StudentCourse, Long> {

	@Query("{ 'idCourse' : ?0, 'finalNote': { $gt : 4 } }")
	public List<Student> findStudentsInCourseWithNotesGreatherThan4(Long idCourse);
}
