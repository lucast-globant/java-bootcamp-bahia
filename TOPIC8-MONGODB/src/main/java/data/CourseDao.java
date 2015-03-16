package data;

import java.util.List;

import models.Course;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CourseDao extends MongoRepository<Course, Long> {

	@Query(value = "{ $and [ { teacherAssigned.idTeacher: ?0 }, { courseName :?0 }}")
	public List<Course> findByTeacherId(Long teacherId);

}
