package topic_7;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
	// This interface has the inherited methods save and findAll
	public Course findByIdCourse(int id_course);
}
