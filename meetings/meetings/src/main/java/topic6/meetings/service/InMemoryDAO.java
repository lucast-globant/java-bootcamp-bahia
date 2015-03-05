package topic6.meetings.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDAO implements DAOMeetings {
	private Map<Long, Meeting> meetings;
	private Map<Long, Room> rooms;
	private Map<Long, Attendee> attendees;

	public InMemoryDAO() {
		meetings = new HashMap<Long, Meeting>();
		rooms = new HashMap<Long, Room>();
		attendees = new HashMap<Long, Attendee>();
		loadExamples();
	}

	private void loadExamples() {
		saveRoom(new Room(8, "Board Room"));
		saveRoom(new Room(50, "Conference Room"));
		saveRoom(new Room(15, "Meeting Room"));

		saveAttendee(new Attendee("Wilson"));
		saveAttendee(new Attendee("Stephen"));
		saveAttendee(new Attendee("Mary"));
		saveAttendee(new Attendee("Rebecca"));

		saveMeeting(new Meeting("Discuss Budget", getRoom(1), new Date(),
				new Date()));
		saveMeeting(new Meeting("Hire new employees", getRoom(2), new Date(), new Date()));
		addAttendeeToMeeting(1, 1);
		addAttendeeToMeeting(1, 2);
		addAttendeeToMeeting(1, 3);
		addAttendeeToMeeting(1, 4);
		addAttendeeToMeeting(2, 2);
		addAttendeeToMeeting(2, 4);
	}

	@Override
	public boolean existsMeeting(long meetingId) {
		return this.meetings.containsKey(meetingId);
	}

	@Override
	public Meeting getMeeting(long meetingId) {
		return this.meetings.get(meetingId);
	}

	@Override
	public List<Meeting> getMeetingsByDesc(String meetingDesc) {
		List<Meeting> result = new ArrayList<Meeting>();
		for (Map.Entry<Long, Meeting> entry : meetings.entrySet()) {
			if (entry.getValue().getDescription() == meetingDesc) {
				result.add(entry.getValue());
			}
		}
		return result;
	}

	@Override
	public boolean saveMeeting(Meeting item) {
		this.meetings.put(item.getMeetingId(), item);
		return true;
	}

	@Override
	public void deleteMeeting(long meetingId) {
		this.meetings.remove(meetingId);
	}

	@Override
	public boolean existsRoom(long roomId) {
		return this.rooms.containsKey(roomId);
	}

	@Override
	public Room getRoom(long roomId) {
		return this.rooms.get(roomId);
	}

	@Override
	public List<Room> getRoomsByName(String roomName) {
		List<Room> result = new ArrayList<Room>();
		for (Map.Entry<Long, Room> entry : rooms.entrySet()) {
			if (entry.getValue().getName() == roomName) {
				result.add(entry.getValue());
			}
		}
		return result;
	}

	@Override
	public boolean saveRoom(Room item) {
		this.rooms.put(item.getRoomId(), item);
		return true;
	}

	@Override
	public void deleteRoom(long roomId) {
		this.rooms.remove(roomId);
	}

	@Override
	public boolean existsAttendee(long attendeeId) {
		return this.attendees.containsKey(attendeeId);
	}

	@Override
	public Attendee getAttendee(long attendeeId) {
		return this.attendees.get(attendeeId);
	}

	@Override
	public List<Attendee> getAttendeesByName(String attendeeName) {
		List<Attendee> result = new ArrayList<Attendee>();
		for (Map.Entry<Long, Attendee> entry : attendees.entrySet()) {
			if (entry.getValue().getName() == attendeeName) {
				result.add(entry.getValue());
			}
		}
		return result;
	}

	@Override
	public boolean saveAttendee(Attendee item) {
		this.attendees.put(item.getAttendeeId(), item);
		return true;
	}

	@Override
	public void deleteAttendee(long attendeeId) {
		this.attendees.remove(attendeeId);
	}

	@Override
	public List<Meeting> getAllMeetings() {
		List<Meeting> result = new ArrayList<Meeting>();
		for (Map.Entry<Long, Meeting> entry : meetings.entrySet())
			result.add(entry.getValue());
		return result;
	}

	@Override
	public void cancelMeeting(long meetingId) {
		Meeting actualMeeting = getMeeting(meetingId);
		if (!actualMeeting.equals(null)) {
			actualMeeting.setState(MeetingState.CANCELED);
			meetings.put(meetingId, actualMeeting);
		}
	}

	@Override
	public void setMeetingRoom(long meetingId, long roomId) {
		Meeting actualMeeting = getMeeting(meetingId);
		Room actualRoom = getRoom(roomId);
		if (!actualMeeting.equals(null) && !actualRoom.equals(null)) {
			actualMeeting.setRoom(actualRoom);
			meetings.put(meetingId, actualMeeting);
		}
	}

	@Override
	public void setMeetingStart(long meetingId, Date from) {
		Meeting actualMeeting = getMeeting(meetingId);
		if (!actualMeeting.equals(null)) {
			actualMeeting.setFromHour(from);
			meetings.put(meetingId, actualMeeting);
		}
	}

	@Override
	public void setMeetingFinish(long meetingId, Date to) {
		Meeting actualMeeting = getMeeting(meetingId);
		if (!actualMeeting.equals(null)) {
			actualMeeting.setToHour(to);
			meetings.put(meetingId, actualMeeting);
		}
	}

	@Override
	public void addAttendeeToMeeting(long meetingId, long attendeeId) {
		Meeting actualMeeting = getMeeting(meetingId);
		Attendee actualAttendee = getAttendee(attendeeId);
		if (!actualMeeting.equals(null) && !actualAttendee.equals(null)) {
			actualMeeting.addAtendee(actualAttendee);
			meetings.put(meetingId, actualMeeting);
		} 
	}

	@Override
	public void setMeetingDesc(long meetingId, String description) {
		Meeting actualMeeting = getMeeting(meetingId);
		if (!actualMeeting.equals(null)) {
			actualMeeting.setDescription(description);
			meetings.put(meetingId, actualMeeting);
		}
	}

}
