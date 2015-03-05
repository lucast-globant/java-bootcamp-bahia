package demo;

import java.util.Date;
import java.util.List;

public class Meeting {

    private final long meetingId;
    private final String name;
    private final Date date;
    private final int timeSlot;
    private Room room;
    private List<Attendee> attendees;

    public Meeting(long id, String name, Date date, int timeSlot, Room room, List<Attendee> attendees) {
    	
        this.meetingId = id;
        this.name = name;
        this.date=date;
        this.timeSlot=timeSlot;
        this.room=room;
        this.attendees=attendees;
        
    }

    public long getMeetingId() {
        return meetingId;
    }

    public String getName() {
        return name;
    }
    
    public Date getDate() {
        return date;
    }

    public int getTimeSlot() {
        return timeSlot;
    }
    
    public Room getRoom() {
        return room;
    }
    public List<Attendee> getAttendee() {
        return attendees;
    }
}
