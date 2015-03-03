package meetingPack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class AttendeeRepository {

	private List<Attendee> store;
	private Calendar calendar = Calendar.getInstance();
	
	public AttendeeRepository(){
		store= new ArrayList<Attendee>();
		store.add(new Attendee(320000,"Martin",new Date(1987,1,8)));
		store.add(new Attendee(320000,"Josh",new Date(1987,1,8)));
		store.add(new Attendee(320000,"Brenda",new Date(1987,1,8)));
		store.add(new Attendee(320000,"Kyle",new Date(1987,1,8)));
	}


	public int getSize(){
		return store.size();
	}
	
	public Attendee getAttendee(int index){
		return store.get(index);
	}
	
	public void addAttendee(Attendee attendee){
		store.add(attendee);
	}
	
	public void removeAttendee(Attendee attendee){
		store.remove(attendee);
	}
}