package com.globant.app.data.mongo.services;

import com.globant.app.data.mongo.entities.Teacher;
import org.springframework.stereotype.Component;

@Component
public interface ITeacherService {

	Teacher addTeacher(Teacher teacher);
}
