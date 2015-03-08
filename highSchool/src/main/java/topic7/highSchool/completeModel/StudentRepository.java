package topic7.highSchool.completeModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query("SELECT s FROM STUDENT s JOIN s.courses n JOIN n.course cs WHERE cs.courseId = ?1 GROUP BY s")
	List<Student> findByCourseId(long courseId);
}
