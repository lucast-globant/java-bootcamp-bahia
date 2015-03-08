package models;

import javax.transaction.Transactional;

@Transactional
public interface NotesDao extends MongoRepository<Notes, String> {

	@Query("{ $and: [ {partialNote1:{$gt: 4}}, {partialNote2:{$gt: 4}},{partialNote3:{$gt: 4}},{finalNote:{$gt: 4}} ]}")
	public List<Note> findNoteGreaterThanFour();

}
