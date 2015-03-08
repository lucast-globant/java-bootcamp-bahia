package topic7.highSchool.manyToMany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course, Long> {
	List<Course> findByStudents(Student student);

	@Query("SELECT c FROM COURSE c JOIN c.students st WHERE st.studentId in ?1 GROUP BY c")
	List<Course> findByStudentId(long studentId);

	List<Course> findByAssignedTeacher(Teacher teacher);

	@Query("SELECT c FROM COURSE c JOIN c.assignedTeacher at WHERE at.teacherId in ?1 GROUP BY c")
	List<Course> findByAssignedTeacherId(long teacherId);
}
