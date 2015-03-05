package topic_7;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
	// This interface has the inherited methods save and findAll
	public Teacher findByIdTeacher(int id_teacher);
}
