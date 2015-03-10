package topic8.highSchoolSpring.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import topic8.highSchoolSpring.model.Course;

public interface CourseRepository extends MongoRepository<Course, Long>{

	public Course findByName(String courseName);
    
    @Query("{assignedTeacher : ?0}")
    public List<Course> findByAssignedTeacher(long teacherId);
}
