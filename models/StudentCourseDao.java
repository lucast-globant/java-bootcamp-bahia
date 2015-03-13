package models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Transactional
public interface StudentCourseDao extends CrudRepository<StudentCourse, Long> {
	
	@Query("select c from course c join studentcourse s on c.cs_id = s.sc_course where s.sc_student = :studentId")
	public List<Course> findCoursesByStudent (@Param("studentId") long studentId);
	 
	@Query("select s from student s join studentcourse c on s.st_id = c.sc_student where c.sc_course = :courseId")
	public List<Student> findStudentsByCourse (@Param("courseId") long courseId);

}