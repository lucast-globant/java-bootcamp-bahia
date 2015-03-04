package topic6.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import topic6.entities.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {

	public void create (Meeting meeting); 
	
	public void cancel (int id);
	
	public void update (Meeting meeting);

	public Meeting findById (int id); 
	
	public List<Meeting> findAll (); 
	
}
