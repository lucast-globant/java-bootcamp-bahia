package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class House {
	private List<Floor> floors;
	private String address;

	public House(String address) {
		this.address = address;
		floors = new ArrayList<Floor>();
	}

	public void addFloor(Floor floor) {
		this.floors.add(floor);
	}

	public String getAddress() {
		return this.address;
	}

	public Floor getFloorNo(int floorNo) {
		if (floorNo < floors.size()) {
			return floors.get(floorNo);
		} else {
			return null;
		}
	}
	public String toString(){
		return("TO DO");
	}
}