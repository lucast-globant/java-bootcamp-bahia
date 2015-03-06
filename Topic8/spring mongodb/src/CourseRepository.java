
package mongodb;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

	public List<Course> findByAssignedTeacher(String assignedTeacher);
	public Course findByID(String iD);

}