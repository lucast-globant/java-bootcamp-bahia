package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>,
		CourseRepositoryCustom {

	public List<Course> getCoursesOfStudent(String studentName,
			String studentLastName);

}
