package com.aguirre.topic8.services;

import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Teacher;

@Service
public interface TeacherService {

	public void addTeacher(Teacher teacher);

	public void deleteTeacher(Teacher teacher);

	public Teacher getTeacher(Long idTeacher);
}
