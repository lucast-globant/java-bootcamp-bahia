package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

	public Course findByName(String name);

	public Course findByIdCourse(String id);
}
