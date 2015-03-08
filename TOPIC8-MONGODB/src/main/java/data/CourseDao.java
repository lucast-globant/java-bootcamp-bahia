package data;

import javax.transaction.Transactional;

import models.Course;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CourseDao extends MongoRepository<Course, String> {

	public Course findByCourse(String name);

	@Query(value = "{ $and [ { teacherAssigned.idTeacher: ?0 }, { courseName :?0 }}")
	public Course findByNameForTeacher(String name, String teacherId);

}
