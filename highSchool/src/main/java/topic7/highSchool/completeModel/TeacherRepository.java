package topic7.highSchool.completeModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teacher, Long> {
	List<Teacher> findByLastName(String lastName);
}
