package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	private List<Room> rooms;
	private int floorNumber;
	private int height;

	public Floor(int number, int height) {
		this.floorNumber = number;
		this.height = height;
		rooms = new ArrayList<Room>();
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public int getHeight() {
		return this.height;
	}

	public int getNumber() {
		return this.floorNumber;
	}

	public Room getRoomNo(int roomNo) {
		if (roomNo < rooms.size()) {
			return rooms.get(roomNo);
		} else {
			return null;
		}
	}
}
