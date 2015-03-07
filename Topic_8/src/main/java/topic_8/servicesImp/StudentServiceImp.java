package topic_8.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic_8.model.Student;
import topic_8.repositories.StudentRepository;
import topic_8.services.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository students;

	@Override
	public Student create(Student t) {
		return students.save(t);
	}

	@Override
	public Student read(Integer id) {
		return students.findOne(id);
	}

	@Override
	public Student update(Student t) {
		return students.save(t);
	}

	@Override
	public void delete(Integer id) {
		students.delete(id);
	}

	@Override
	public List<Student> findAll() {
		return students.findAll();
	}

}
