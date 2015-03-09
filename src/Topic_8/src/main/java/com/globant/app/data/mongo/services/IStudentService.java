package com.globant.app.data.mongo.services;

import com.globant.app.data.mongo.entities.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IStudentService {

	Student addStudent(Student student);

	List<Student> findByCoursesNotesFinalNoteGreaterThanAndCoursesNotesFirstPartialNoteGreaterThanAndCoursesNotesSecondPartialNoteGreaterThanAndCoursesNotesThirdPartialNoteGreaterThan(
			int i, int i1, int i2, int i3);
}
