package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface StudentCourseDao extends CrudRepository<StudentCourse, Long> {

	public StudentCourse findByStudentNameAndLastName(String name, String lastName);

}