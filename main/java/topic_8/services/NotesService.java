package topic_8.services;


import java.util.List;

import org.springframework.stereotype.Component;

import topic_8.entities.Student;
import topic_8.entities.Notes;

@Component
public interface NotesService {
	
	public Notes create(Notes t);

	public Notes read(Integer id);

	public Notes update(Notes t);

	public void delete(Integer id);

	public List<Notes> findAll();
	
	public List<Student> findStudentsWithNotesGreaterThanFour(Integer id); 

}
