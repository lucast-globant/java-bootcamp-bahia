package entities;

public class Room {
	private static int uniqueID = 1;
	private int id;

	public Room() {
		id=newUniqueID();
	}

	private int newUniqueID() {
		return uniqueID++;
	}

	public int getId() {
		return id;
	}

}
