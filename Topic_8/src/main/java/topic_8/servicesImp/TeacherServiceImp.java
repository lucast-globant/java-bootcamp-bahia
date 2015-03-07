package topic_8.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic_8.model.Teacher;
import topic_8.repositories.TeacherRepository;
import topic_8.services.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService {
	@Autowired
	private TeacherRepository teachers;

	@Override
	public Teacher create(Teacher t) {
		return teachers.save(t);
	}

	@Override
	public Teacher read(Integer id) {
		return teachers.findOne(id);
	}

	@Override
	public Teacher update(Teacher t) {
		return teachers.save(t);
	}

	@Override
	public void delete(Integer id) {
		teachers.delete(id);
	}

	@Override
	public List<Teacher> findAll() {
		return teachers.findAll();
	}

}
