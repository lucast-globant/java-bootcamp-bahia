package topic6.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {

	public Meeting save (Meeting meeting); 
	
	public void delete (Meeting meeting);

	public Meeting findById (int id); 
	
	public List<Meeting> findAll (); 
	
}