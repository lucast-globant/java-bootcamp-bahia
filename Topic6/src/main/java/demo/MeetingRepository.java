package demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MeetingRepository {
	
	private List<Meeting> meetings;
	private Calendar calendar = Calendar.getInstance();
	private RoomRepository roomRepository= new RoomRepository();
	 
	private AttendeeRepository attendeeRepository=new AttendeeRepository();
	
	public MeetingRepository(){
		List<Attendee> attendees;
		attendees= new ArrayList<Attendee>();
		attendees.add(attendeeRepository.getAttendee(0));
		attendees.add(attendeeRepository.getAttendee(1));
		meetings= new ArrayList<Meeting>();
		meetings.add(new Meeting(1,"myfancymeeting 1",calendar.getTime(),120,roomRepository.getRoom(0),attendees));
		meetings.add(new Meeting(2,"myfancymeeting 2",calendar.getTime(),60,roomRepository.getRoom(1),attendees));
		meetings.add(new Meeting(3,"myfancymeeting 3",calendar.getTime(),45,roomRepository.getRoom(1),attendees));
	}
	
	public List<Meeting> getAllMeeting(){
		
		return meetings;		
	}

	public Meeting getAMeeting(int index){
		
		return meetings.get(index);
		
	}
	public void addMeeting(Meeting meeting){
		meetings.add(meeting);
	}

	public void removeMeeting(int meeting) {
		meetings.remove(meeting);
		
	}

	public void updateMeeting(Meeting meeting) {
		for(Meeting item : meetings){
	    	if(item.getMeetingId()==meeting.getMeetingId())
	    		meetings.remove(item);	    	
	    }
		meetings.add(meeting);
		
	}
}
