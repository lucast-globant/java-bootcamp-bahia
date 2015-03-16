package topic_8.services;

import java.util.List;

import org.springframework.stereotype.Component;

import topic_8.entities.Teacher;
@Component
public interface TeacherService {

	public Teacher create(Teacher t);

	public Teacher read(Integer id);

	public Teacher update(Teacher t);

	public void delete(Integer id);

	public List<Teacher> findAll();
}
