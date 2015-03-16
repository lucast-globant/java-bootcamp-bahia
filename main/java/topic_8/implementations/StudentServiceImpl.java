package topic_8.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import topic_8.entities.Student;
import topic_8.repositories.StudentRepository;
import topic_8.services.StudentService;
@Component
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repo;

	@Override
	public Student create(Student t) {

		return repo.save(t);
	}

	@Override
	public Student read(Integer id) {

		return repo.findOne(id);
	}

	@Override
	public Student update(Student t) {

		return repo.save(t);
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);

	}

	@Override
	public List<Student> findAll() {

		return repo.findAll();
	}

}
