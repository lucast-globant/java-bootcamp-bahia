package exc03;

import java.util.List;

/* Product Hospital */

public class Hospital {

	private List<Room> rooms;
	private String name;
	private String type; // if the hospital is private or public.
	private String director; // the hospital director.

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		String resu = new String();
		resu += " Hospital name: " + name + System.getProperty("line.separator") + " Director: " + director
				+ System.getProperty("line.separator") + " Type: " + type + System.getProperty("line.separator") + " ---  Rooms info ----"
				+ System.getProperty("line.separator");
		for (Room r : rooms)
			resu += " Room : " + System.getProperty("line.separator") + r.toString() + System.getProperty("line.separator");

		return resu;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
