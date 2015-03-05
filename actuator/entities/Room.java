package topic6.actuator.entities;

public class Room {
	private static int uniqueID = 1;
	private String name;
	private int id;

	public Room(String name) {
		this.setName(name);
		id = newUniqueID();
	}

	private int newUniqueID() {
		return uniqueID++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
