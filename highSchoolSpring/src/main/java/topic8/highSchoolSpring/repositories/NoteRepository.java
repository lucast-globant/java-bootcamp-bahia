package topic8.highSchoolSpring.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import topic8.highSchoolSpring.model.Note;

public interface NoteRepository extends MongoRepository<Note, Long>{
	
	@Query(value="{'courseId' : ?0, note1 : {$gt : 4}, note2 : {$gt : 4}, note3 : {$gt : 4}, finalNote : {$gt : 4}}", fields="{_id : 0, studentId : 1}")
	List<Note> findStudentsWithNotesGreaterThan4FromCourse(long courseId);
	
	@Query("{'courseId' : ?0, note1 : {$gt : 4}, note2 : {$gt : 4}, note3 : {$gt : 4}, finalNote : {$gt : 4}}, {'studentId.$' : 1}")
	List<Note> findPlease(long courseId);
}
