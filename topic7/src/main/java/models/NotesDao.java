package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface NotesDao extends CrudRepository<Notes, Long> {

	public Notes findByStudentNameAndLastName(String name, String lastName);

}
