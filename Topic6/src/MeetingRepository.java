package meetingPack;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MeetingRepository {
	
	private List<Meeting> store;
	private Calendar calendar = Calendar.getInstance();
	private RoomRepository roomRepository= new RoomRepository();
	 
	private AttendeeRepository attendeeRepository=new AttendeeRepository();
	
	public MeetingRepository(){
		List<Attendee> attendees;
		attendees= new ArrayList<Attendee>();
		attendees.add(attendeeRepository.getAttendee(0));
		attendees.add(attendeeRepository.getAttendee(1));
		store= new ArrayList<Meeting>();
		store.add(new Meeting(1,"firstMeeting",calendar.getTime(),120,roomRepository.getRoom(0),attendees));
		store.add(new Meeting(2,"secondMeeting",calendar.getTime(),60,roomRepository.getRoom(1),attendees));
		store.add(new Meeting(3,"ThirdMeeting",calendar.getTime(),45,roomRepository.getRoom(1),attendees));
	}
	
	public List<Meeting> getAllMeeting(){
		
		return store;		
	}

	public Meeting getAMeeting(int index){
		
		return store.get(index);
		
	}
	public void addMeeting(Meeting meeting){
		store.add(meeting);
	}

	public void removeMeeting(int meeting) {
		store.remove(meeting);
		
	}

	public void updateMeeting(Meeting meeting) {
		for(Meeting item : store){
	    	if(item.getMeetingID()==meeting.getMeetingID())
	    		store.remove(item);	    	
	    }
		store.add(meeting);
		
	}
}
