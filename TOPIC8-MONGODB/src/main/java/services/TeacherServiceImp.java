package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import data.TeacherDao;
import models.Teacher;

public class TeacherServiceImp implements TeacherService {

	@Autowired
	TeacherDao teacherDao;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.save(teacher);
	}

	@Override
	public Teacher readTeacher(Long teacherId) {
		return teacherDao.findOne(teacherId);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherDao.save(teacher);
	}

	@Override
	public void deleteTeacher(Long teacherId) {
		teacherDao.delete(teacherId);

	}

	@Override
	public List<Teacher> findAll() {
		return teacherDao.findAll();
	}

}
