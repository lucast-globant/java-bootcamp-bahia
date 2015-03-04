package rest;

import java.util.List;

public interface MeetingService {
	
	public Meeting create (Meeting meeting); 
	public void delete (Long id);
	public List<Meeting> getMeetings();
	public Meeting updateMeeting(Meeting meeting);
	public Meeting findMeetingById(Long Id);
	
}