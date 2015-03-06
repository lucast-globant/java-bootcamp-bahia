package topic6.services;

import java.util.List;
import topic6.repositories.Meeting;

public interface MeetingService {
	
	public void create (Meeting meeting); 
	
	public void cancel (Meeting meeting);
	
	public void update (int meetingId, Meeting meeting);
	
	public Meeting findById (int id); 
	
	public List<Meeting> findAll (); 

}
