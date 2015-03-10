package repositories;

import java.util.List;

import model.Course;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseDao extends MongoRepository<Course, String> {

	public List<Course> findAll();

	public Course findById(ObjectId id);

}