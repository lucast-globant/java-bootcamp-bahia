package com.globant.app.data.mongo.services.implementation;

import com.globant.app.data.mongo.entities.Teacher;
import com.globant.app.data.mongo.repositories.ITeacherRepo;
import com.globant.app.data.mongo.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherService implements ITeacherService {

	@Autowired
	private ITeacherRepo teacherRepo;

	@Override public Teacher addTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}
}
