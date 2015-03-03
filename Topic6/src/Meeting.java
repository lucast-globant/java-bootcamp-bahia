package meetingPack;

import java.util.Date;
import java.util.List;

public class Meeting {

    private final long meetingID;
    private final String name;
    private final Date date;
    private final int slotMinutTime;
    private Room room;
    private List<Attendee> attendees;

    public Meeting(long id, String content, Date date, int slotMinutTime, Room room, List<Attendee> attendees) {
    	
        this.meetingID = id;
        this.name = content;
        this.date=date;
        this.slotMinutTime=slotMinutTime;
        this.room=room;
        this.attendees=attendees;
        
    }

    public long getMeetingID() {
        return meetingID;
    }

    public String getName() {
        return name;
    }
    
    public Date getDate() {
        return date;
    }

    public int getSlotTime() {
        return slotMinutTime;
    }
    
    public Room getRoom() {
        return room;
    }
    public List<Attendee> getAttendee() {
        return attendees;
    }
}
