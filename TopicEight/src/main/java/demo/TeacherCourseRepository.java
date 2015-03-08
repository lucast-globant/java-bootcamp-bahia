package demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherCourseRepository extends
		MongoRepository<TeacherCourse, String> {

	public List<TeacherCourse> findByIdTeacherFk(String id);
}
