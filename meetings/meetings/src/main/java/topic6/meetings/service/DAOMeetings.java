package topic6.meetings.service;

import java.util.Date;
import java.util.List;

public interface DAOMeetings {
	public boolean existsMeeting(long meetingId);
    public Meeting getMeeting(long meetingId);
    public List<Meeting> getMeetingsByDesc(String meetingDesc);
    public boolean saveMeeting(Meeting item);
    public void deleteMeeting(long meetingId);
    public List<Meeting> getAllMeetings();
    public void cancelMeeting(long meetingId);
    public void setMeetingRoom(long meetingId,long idRoom);
    public void setMeetingStart(long meetingId, Date to);
    public void setMeetingFinish(long meetingId, Date from);
    public void setMeetingDesc(long meetingId, String description);
    public void addAttendeeToMeeting(long meetingId, long attendeeId);
    
    public boolean existsRoom(long roomId);
    public Room getRoom(long roomId);
    public List<Room> getRoomsByName(String roomName);
    public boolean saveRoom(Room item);
    public void deleteRoom(long roomId);
    
    public boolean existsAttendee(long attendeeId);
    public Attendee getAttendee(long attendeeId);
    public List<Attendee> getAttendeesByName(String attendeeName);
    public boolean saveAttendee(Attendee item);
    public void deleteAttendee(long attendeeId);
}
