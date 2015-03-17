package com.aguirre.topic8.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Student;

@Service
public interface StudentService {

	public void addStudent(Student student);

	public void deleteStudent(Student student);

	public Student getStudent(Long idStudent);

	public List<Student> getStudentsByIdStudent(List<Long> idStudents);
}
