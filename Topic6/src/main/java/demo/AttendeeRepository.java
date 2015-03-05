package demo;

import java.util.ArrayList;
import java.util.List;

public class AttendeeRepository {

	private List<Attendee> attendees;

	public AttendeeRepository() {
		attendees = new ArrayList<Attendee>();
		attendees.add(new Attendee(1, "Jordan"));
		attendees.add(new Attendee(2, "Juan"));
		attendees.add(new Attendee(3, "Lucas"));
		attendees.add(new Attendee(4, "Laura"));
		attendees.add(new Attendee(5, "Dario"));
	}

	public int getSize() {
		return attendees.size();
	}

	public Attendee getAttendee(int index) {
		return attendees.get(index);
	}

	public void addAttendee(Attendee attendee) {
		attendees.add(attendee);
	}

	public void removeAttendee(Attendee attendee) {
		attendees.remove(attendee);
	}
}