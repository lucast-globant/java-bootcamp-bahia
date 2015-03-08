package topic7.highSchool.completeModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course, Long> {
	@Query("SELECT c FROM COURSE c JOIN c.students n JOIN n.student st WHERE st.studentId = ?1 GROUP BY c")
	List<Course> findByStudentId(long studentId);

	@Query("SELECT c FROM COURSE c JOIN c.assignedTeacher at WHERE at.teacherId in ?1 GROUP BY c")
	List<Course> findByAssignedTeacherId(long teacherId);
}
