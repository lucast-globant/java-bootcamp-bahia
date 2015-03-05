package topic6.meetings.service;

import java.util.concurrent.atomic.AtomicLong;

public class Attendee {
	private String name;
	private static AtomicLong nextId = new AtomicLong(1);

	private long attendeeId;

	public Attendee(String name) {
		setAttendeeId(nextId.getAndIncrement());
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAttendeeId() {
		return attendeeId;
	}

	protected void setAttendeeId(long attendeeId) {
		this.attendeeId = attendeeId;
	}
}
