package topic_7;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RindeRepository extends JpaRepository<Rinde,Long> {

	//Create a method to fetch all courses of a given student.
	public List<Course> findCoursesByRegNumber(int reg_number);
	
	//Create a method to fetch all students of a given course
	public List<Student> findStudentsByIdCourse(int id_course);
}
