package topic_8.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import topic_8.entities.Teacher;
import topic_8.repositories.TeacherRepository;
import topic_8.services.TeacherService;
@Component
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository repo;

	@Override
	public Teacher create(Teacher t) {

		return repo.save(t);
	}

	@Override
	public Teacher read(Integer id) {

		return repo.findOne(id);
	}

	@Override
	public Teacher update(Teacher t) {

		return repo.save(t);
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);

	}

	@Override
	public List<Teacher> findAll() {

		return repo.findAll();
	}

}
