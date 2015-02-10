package exc02;

import java.util.List;

/* Product House */

public class House {

	private List<Room> rooms; // a list of rooms of the house.
	private float size; // size of the house.
	private String roof; // the roof of the house.
	private String address; // location of the house.

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String toString() {
		String resu = new String();
		resu += " House address : " + address + System.getProperty("line.separator") + " Roof : " + roof
				+ System.getProperty("line.separator") + " Size : " + size + System.getProperty("line.separator") + " ---  Rooms info ----"
				+ System.getProperty("line.separator");
		for (Room r : rooms)
			resu += " Room : " + System.getProperty("line.separator") + r.toString() + System.getProperty("line.separator");

		return resu;
	}

}
