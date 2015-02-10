package topic_0_2;

public class House {
	private int rooms;
	private int doors;
	private int windows;
	private int garage;
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public int getGarage() {
		return garage;
	}
	public void setGarage(int garage) {
		this.garage = garage;
	}
	
	public String toString() {
		return "rooms:" + rooms + ", doors:" + doors + ", windows:" + windows + ", garage:" + garage;
	}
}
