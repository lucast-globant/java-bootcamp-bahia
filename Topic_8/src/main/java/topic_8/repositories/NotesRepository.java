package topic_8.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import topic_8.model.Notes;

public interface NotesRepository extends MongoRepository<Notes, Integer> {

	public List<Notes> findByCourseIdCourseAndFinalNoteGreaterThan(Integer idCourse, Integer note);

}
