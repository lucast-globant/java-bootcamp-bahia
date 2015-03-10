package repositories;

import java.util.List;

import model.Teacher;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TeacherDao extends MongoRepository<Teacher, String> {

	public List<Teacher> findAll();

	Teacher findById(ObjectId id);

	
}
