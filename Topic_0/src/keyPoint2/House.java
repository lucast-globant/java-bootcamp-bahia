package keyPoint2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * This class is a simple representation of a house with certain limitations.
 * It consists of a list of floors and each one is a list of rooms. The rooms are 
 * represented with a pair of points, which are integer coordinates.
 * Each floor has a defined height, which is also an integer. 
 * */
public class House {
	private List<Floor> floors;
	private int surface;

	public House() {
		floors = new ArrayList<Floor>();
	}

	public void addFloor(Floor floor) {
		this.floors.add(floor);
	}
	
	public void setSurface(int surface){
		this.surface=surface;
	}

	public int getSurface() {
		return this.surface;
	}

	public Floor getFloorNo(int floorNo) {
		if (floorNo < floors.size()) {
			return floors.get(floorNo);
		} else {
			return null;
		}
	}
	public String toString(){
		String output = "";
		Iterator<Floor> iteratorFloors = floors.iterator();

		while(iteratorFloors.hasNext()){
		  Floor aFloor = iteratorFloors.next();
		  output = output.concat(aFloor.toString() + "_____________\n");
		}
		return(output.concat("\n=============\n"));
	}
}