package model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface StudentTakesCourseDao extends CrudRepository<StudentTakesCourse, Long> {

//	public StudentCourse findByStudentNameAndLastName(String name, String lastName);
//	public StudentTakesCourse findByStudentId(Long id);
	public StudentTakesCourse findByRegisterNumber(Long id);

}