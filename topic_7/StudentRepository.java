package topic_7;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
	// This interface has the inherited methods save and findAll
	public Student findByRegNumber(int reg_number);
}