package topic6.entities;

public class Room {
	
	private int id;
	private String name;
	private int capacity;
	
	public Room () {}
	
	public Room(int id, String name, int capacity) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public Room setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Room setName(String name) {
		this.name = name;
		return this;
	}

	public int getCapacity() {
		return capacity;
	}

	public Room setCapacity(int capacity) {
		this.capacity = capacity;
		return this;
	}
	
	 public Room copyFrom(Room room) {
		 if (room != null) {
			 this.name = room.name;
			 this.capacity = room.capacity;
		 }
		 return this;
	 }

}
