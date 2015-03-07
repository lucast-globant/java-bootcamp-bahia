package topic_8.services;

import java.util.List;

import topic_8.model.Notes;
import topic_8.model.Student;

public interface NotesService extends GenericService<Notes> {

	public List<Student> findStudentsWithNotesGreaterThanFour(Integer idCourse);
}
