package rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Room {
	@Id
	@GeneratedValue
	private Long id_room;
	private String name;
	private int capacity;

	public Room(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public Room() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Long getId_room() {
		return id_room;
	}

	@Override
	public String toString() {
		return "Room [id=" + id_room + ", name=" + name + ", capacity=" + capacity
				+ "]";
	}

}
