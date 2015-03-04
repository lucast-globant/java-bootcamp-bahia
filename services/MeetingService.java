package topic6.services;

import java.util.List;
import topic6.entities.Meeting;

public interface MeetingService {
	
	public void create (Meeting meeting); 
	
	public void cancel (int id);
	
	public void update (Meeting meeting);
	
	public Meeting findById (int id); 
	
	public List<Meeting> findAll (); 

}
