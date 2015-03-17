package com.aguirre.topic8.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public void addStudent(Student student) {
		studentDao.save(student);
	}

	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}

	public Student getStudent(Long idStudent) {
		return studentDao.findOne(idStudent);
	}

	public List<Student> getStudentsByIdStudent(List<Long> idStudents) {
		List<Student> students = new ArrayList<Student>();
		for (Long idStudent : idStudents) {
			students.add(studentDao.findOne(idStudent));
		}
		return students;
	}
}
