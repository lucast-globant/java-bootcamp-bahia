package com.aguirre.topic8.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.repositories.StudentDao;

public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void addStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}

	@Override
	public Student getStudent(Long idStudent) {
		return studentDao.findOne(idStudent);
	}

	@Override
	public List<Student> getStudentsByIdStudent(List<Long> idStudents) {
		List<Student> students = new ArrayList<Student>();
		for (Long idStudent : idStudents) {
			students.add(studentDao.findOne(idStudent));
		}
		return students;
	}
}
