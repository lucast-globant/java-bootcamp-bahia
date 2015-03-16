package topic_8.services;

import java.util.List;

import org.springframework.stereotype.Component;

import topic_8.entities.Student;

@Component
public interface StudentService {
	public Student create(Student t);

	public Student read(Integer id);

	public Student update(Student t);

	public void delete(Integer id);

	public List<Student> findAll();
}
