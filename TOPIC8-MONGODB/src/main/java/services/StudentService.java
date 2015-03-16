package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Student;

@Service
public interface StudentService {

	public Student saveStudent(Student student);

	public Student readStudent(Long studentId);

	public Student updateStudent(Student student);

	public void deleteStudent(Long studentId);

	public List<Student> findAll();
	
	public List<Student> findNoteGreaterThanFour();

}
