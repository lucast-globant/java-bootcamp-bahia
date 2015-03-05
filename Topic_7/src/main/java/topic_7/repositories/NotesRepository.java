package topic_7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import topic_7.model.Notes;


@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {

	

}
