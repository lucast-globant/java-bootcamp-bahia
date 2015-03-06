package topic_7.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import topic_7.model.Course;
import topic_7.model.Notes;
import topic_7.model.Student;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {

	@Query("Select s from Notes n join n.student s where n.idCourse = ?")
	List<Student> findStudentsByCourse(Integer idCourse);

	@Query("Select c from Notes n join n.course c where n.registrationNumber = ?")
	List<Course> findCoursesByStudent(Integer registrationNumber);

}
