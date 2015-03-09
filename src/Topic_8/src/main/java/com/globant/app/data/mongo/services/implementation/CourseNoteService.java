package com.globant.app.data.mongo.services.implementation;

import com.globant.app.data.mongo.entities.Course;
import com.globant.app.data.mongo.entities.CourseNote;
import com.globant.app.data.mongo.entities.Student;
import com.globant.app.data.mongo.repositories.ICourseNoteRepo;
import com.globant.app.data.mongo.repositories.ICourseRepo;
import com.globant.app.data.mongo.repositories.IStudentRepo;
import com.globant.app.data.mongo.services.ICourseNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseNoteService implements ICourseNoteService {

	@Autowired
	private IStudentRepo studentRepo;

	@Autowired
	private ICourseRepo courseRepo;

	@Autowired
	private ICourseNoteRepo courseNoteRepo;

	@Override public CourseNote addCourseNote(CourseNote courseNote) {
		courseNoteRepo.save(courseNote);

		Student student = studentRepo.findById(courseNote.getStudentId());
		student.getCoursesNotes().add(courseNote);
		studentRepo.save(student);

		Course course = courseRepo.findById(courseNote.getCourseId());
		course.getStudentsNotes().add(courseNote);
		courseRepo.save(course);

		return courseNote;
	}
}
