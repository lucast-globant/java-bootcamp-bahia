package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentCourseRepository extends
		MongoRepository<StudentCourse, String> {

	public StudentCourse findByIdStudentCourse(String id);
}
