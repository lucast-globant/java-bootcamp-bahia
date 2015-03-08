package topic7.highSchool.manyToMany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
	// List<Student> findByLastName(String lastName);
	List<Student> findByCourses(Course course);

	@Query("SELECT s FROM STUDENT s JOIN s.courses cs WHERE cs.courseId in ?1 GROUP BY s")
	List<Student> findByCourseId(long courseId);
}
