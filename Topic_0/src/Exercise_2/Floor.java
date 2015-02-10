package Exercise_2;

public class Floor {
	private Room[] rooms;

	public Floor(Room[] r) {
		rooms = r;
	}

	public void setRooms(Room[] r) {
		rooms = r;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < rooms.length; i++) {
			s += "\t\tRoom " + i + ": " + rooms[i].toString();
			if (i < rooms.length - 1)
				s += "\n";
		}
		return s;
	}
}
