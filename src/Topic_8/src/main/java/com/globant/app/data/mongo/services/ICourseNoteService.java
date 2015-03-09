package com.globant.app.data.mongo.services;

import com.globant.app.data.mongo.entities.CourseNote;
import org.springframework.stereotype.Component;

@Component
public interface ICourseNoteService {

	CourseNote addCourseNote(CourseNote courseNote);

}
