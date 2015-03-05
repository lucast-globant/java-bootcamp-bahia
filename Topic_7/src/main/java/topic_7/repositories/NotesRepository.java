package topic_7.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import topic_7.model.Course;
import topic_7.model.Notes;
import topic_7.model.Student;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
	List<Course> findCoursesByRegistrationNumber(Integer registrationNumber);
	
	List<Student> findStudentsByIdCourse(Integer idCourse);

}
