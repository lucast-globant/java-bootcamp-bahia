package repositories;

import java.util.List;

import model.TeacherDictateCourse;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Component
public interface TeacherDictateCourseDao extends MongoRepository<TeacherDictateCourse, String>{
	
	public List<TeacherDictateCourse> findByTeacherId(ObjectId TeacherId);
	
	
}
