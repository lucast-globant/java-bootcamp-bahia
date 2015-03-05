package topic6.meetings.service;

import java.util.concurrent.atomic.AtomicLong;

public class Room {
	private int capacity;
	private String name;
	private long roomId;
	private static AtomicLong nextId = new AtomicLong(1);

	public Room(int capacity, String name) {
		setRoomId(nextId.getAndIncrement());
		this.setCapacity(capacity);
		this.setName(name);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRoomId() {
		return roomId;
	}

	protected void setRoomId(long roomId) {
		this.roomId = roomId;
	}

}
