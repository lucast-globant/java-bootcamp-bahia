package topic8.highSchoolSpring.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import topic8.highSchoolSpring.model.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {
	public Student findByLastName(String lastName);

	public Student findByFirstName(String firstName);
	
	@Query("{ _id: { $in: ?0 } }")
	public List<Student> findByIds(List<Long> studentsIds);
}
