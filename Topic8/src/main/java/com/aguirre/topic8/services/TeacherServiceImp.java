package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.aguirre.topic8.models.Teacher;
import com.aguirre.topic8.repositories.TeacherDao;

public class TeacherServiceImp implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	@Override
	public void addTeacher(Teacher teacher) {
		teacherDao.save(teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		teacherDao.delete(teacher);
	}

	@Override
	public Teacher getTeacher(Long idTeacher) {
		return teacherDao.findOne(idTeacher);
	}
}
