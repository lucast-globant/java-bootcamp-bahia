package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Teacher;

@Service
public interface TeacherService {

	public Teacher saveTeacher(Teacher teacher);

	public Teacher readTeacher(Long teacherId);

	public Teacher updateTeacher(Teacher teacher);

	public void deleteTeacher(Long teacherId);

	public List<Teacher> findAll();

}
