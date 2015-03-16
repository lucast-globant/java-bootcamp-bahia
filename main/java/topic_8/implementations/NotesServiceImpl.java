package topic_8.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import topic_8.entities.Notes;
import topic_8.entities.Student;
import topic_8.repositories.NotesRepository;
import topic_8.services.NotesService;
@Component
@Service
public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesRepository repo;

	@Override
	public Notes create(Notes t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Notes read(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public Notes update(Notes t) {
		return repo.save(t);
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public List<Notes> findAll() {
		return repo.findAll();
	}
	@Override
	public List<Student> findStudentsWithNotesGreaterThanFour(Integer idCourse) {
		List<Notes> aux = repo.findByCourseIdCourseAndFinalNoteGreaterThan(idCourse, 4);
		List<Student> toReturn = new ArrayList<Student>();
		for (Notes n : aux) {
			toReturn.add(n.getStudent());
		}
		return toReturn;
	}

}
