package com.globant.app.data.mongo.services.implementation;

import com.globant.app.data.mongo.entities.Student;
import com.globant.app.data.mongo.repositories.IStudentRepo;
import com.globant.app.data.mongo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepo studentRepo;

	@Override public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override public List<Student> findByCoursesNotesFinalNoteGreaterThanAndCoursesNotesFirstPartialNoteGreaterThanAndCoursesNotesSecondPartialNoteGreaterThanAndCoursesNotesThirdPartialNoteGreaterThan(
			int minFinalNote, int minFirstPartialNote, int minSecondPartialNote, int minThirdPartialNote) {
		return studentRepo.findByCoursesNotesFinalNoteGreaterThanAndCoursesNotesFirstPartialNoteGreaterThanAndCoursesNotesSecondPartialNoteGreaterThanAndCoursesNotesThirdPartialNoteGreaterThan(minFinalNote, minFirstPartialNote, minSecondPartialNote, minThirdPartialNote);
	}
}
