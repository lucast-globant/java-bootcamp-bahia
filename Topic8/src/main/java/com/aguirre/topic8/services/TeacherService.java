package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.Teacher;
import com.aguirre.topic8.repositories.TeacherDao;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	public void addTeacher(Teacher teacher) {
		teacherDao.save(teacher);
	}

	public void deleteTeacher(Teacher teacher) {
		teacherDao.delete(teacher);
	}

	public Teacher getTeacher(Long idTeacher) {
		return teacherDao.findOne(idTeacher);
	}
}
