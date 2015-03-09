package com.globant.app.data.mongo.repositories;

import com.globant.app.data.mongo.entities.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IStudentRepo extends IRepository<Student> {

	List<Student> findByCoursesNotesFinalNoteGreaterThan(int minNote);

	List<Student> findByCoursesNotesFinalNoteGreaterThanAndCoursesNotesFirstPartialNoteGreaterThanAndCoursesNotesSecondPartialNoteGreaterThanAndCoursesNotesThirdPartialNoteGreaterThan(int minFinalNote, int minFirstPartialNote,int minSecondPartialNote,int minThirdPartialNote );

	Student findById(String id);

}