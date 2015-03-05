package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>, StudentRepositoryCustom{
	
	public List<Student> getStudentsOfCourse(String courseName);
}
