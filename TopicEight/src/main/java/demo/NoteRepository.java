package demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface NoteRepository extends MongoRepository<Note, String> {

	@Query("{ $and: [ {partialNote1:{$gt: 4}}, {partialNote2:{$gt: 4}},{partialNote3:{$gt: 4}},{finalNote:{$gt: 4}} ]}")
	public List<Note> findNotesGreaterThanFour();
}
