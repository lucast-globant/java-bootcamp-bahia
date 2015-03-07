package topic_8.servicesImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic_8.model.Notes;
import topic_8.model.Student;
import topic_8.repositories.NotesRepository;
import topic_8.services.NotesService;

@Service
public class NotesServiceImp implements NotesService {
	@Autowired
	private NotesRepository notes;

	@Override
	public Notes create(Notes t) {
		return notes.save(t);
	}

	@Override
	public Notes read(Integer id) {
		return notes.findOne(id);
	}

	@Override
	public Notes update(Notes t) {
		return notes.save(t);
	}

	@Override
	public void delete(Integer id) {
		notes.delete(id);
	}

	@Override
	public List<Notes> findAll() {
		return notes.findAll();
	}

	@Override
	public List<Student> findStudentsWithNotesGreaterThanFour(Integer idCourse) {
		List<Notes> aux = notes.findByCourseIdCourseAndFinalNoteGreaterThan(idCourse, 4);
		List<Student> toReturn = new ArrayList<Student>();
		for (Notes n : aux) {
			toReturn.add(n.getStudent());
		}
		return toReturn;
	}

}
