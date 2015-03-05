package topic6.actuator.entities;

public class Room {

	private String name;
	private int id;

	public Room(String name) {
		this.setName(name);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
