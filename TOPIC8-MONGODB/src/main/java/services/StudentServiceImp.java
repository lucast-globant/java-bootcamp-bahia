package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import data.NotesDao;
import data.StudentDao;
import models.Student;

public class StudentServiceImp implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Autowired
	NotesDao notesDao;

	@Override
	public Student saveStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student readStudent(Long studentId) {
		return studentDao.findOne(studentId);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public void deleteStudent(Long studentId) {
		studentDao.delete(studentId);

	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public List<Student> findNoteGreaterThanFour() {
		return notesDao.findNotesGreaterThanFour();
	}

}
