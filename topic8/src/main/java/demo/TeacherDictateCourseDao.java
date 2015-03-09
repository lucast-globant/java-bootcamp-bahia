package demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

public interface TeacherDictateCourseDao extends MongoRepository<TeacherDictateCourse, String>{
	
	public List<TeacherDictateCourse> findByTeacherId(ObjectId TeacherId);
	
	
}
