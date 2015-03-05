package topic6.meetings.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class Meeting {
	private static AtomicLong nextId = new AtomicLong(1);

	private String description;
	private Date fromTime, toTime;
	private MeetingState state;

	private Room room;
	private Set<Attendee> attendees;
	private long meetingId;

	public Meeting(String description, Room room, Date from, Date to) {
		setMeetingId(nextId.getAndIncrement());
		this.setDescription(description);
		this.setRoom(room);
		this.setFromHour(from);
		this.setToHour(to);
		attendees = new HashSet<Attendee>();
		setState(MeetingState.PENDING);

	}

	public void addAtendee(Attendee atendee) {
		attendees.add(atendee);
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getToHour() {
		return toTime;
	}

	public void setToHour(Date to) {
		this.toTime = to;
	}

	public Date getFromHour() {
		return fromTime;
	}

	public void setFromHour(Date from) {
		this.fromTime = from;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state.toString();
	}

	public void setState(MeetingState state) {
		this.state = state;
	}

	public boolean isCanceled() {
		return state == MeetingState.CANCELED;
	}

	public boolean isPending() {
		return state == MeetingState.PENDING;
	}

	public boolean isResolved() {
		return state == MeetingState.RESOLVED;
	}

	public long getMeetingId() {
		return meetingId;
	}

	protected void setMeetingId(long meetingId) {
		this.meetingId = meetingId;
	}

	public String toString() {
		String result;
		SimpleDateFormat ddMMyyyyhhmm = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		result = "-======================-<br />" + this.getDescription()
				+ "<br />------------------------<br />Status: "
				+ state.toString() + "<br />Room: " + this.getRoom().getName()
				+ "<br />From: " + ddMMyyyyhhmm.format(this.getFromHour())
				+ "<br />To: " + ddMMyyyyhhmm.format(this.getToHour())
				+ "<br />Attendees:<br />";
		for (Attendee attendee : attendees) {
			result.concat(attendee.getName() + "<br />");
		}
		return (result.concat("-======================-<br />"));
	}
}
