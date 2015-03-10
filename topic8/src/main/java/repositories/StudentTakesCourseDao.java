package repositories;


import java.util.List;

import model.StudentTakesCourse;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentTakesCourseDao extends MongoRepository<StudentTakesCourse, String> {

	List<StudentTakesCourse> findAllByCourseId(ObjectId id);


}