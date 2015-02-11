package keyPoint2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Floor {
	private List<Room> rooms;
	private int floorNumber;
	private int height;

	public Floor(int number, int height) {
		this.floorNumber = number;
		this.height = height;
		rooms = new ArrayList<Room>();
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public int getHeight() {
		return this.height;
	}

	public int getNumber() {
		return this.floorNumber;
	}
	
	public String toString(){
		String output = "Floor number " + floorNumber + "\n";
		Iterator<Room> iteratorRooms = rooms.iterator();

		while(iteratorRooms.hasNext()){
		  Room aRoom = iteratorRooms.next();
		  output = output.concat(aRoom.getName() + "\n");
		}
		return(output);
	}

	public Room getRoomNo(int roomNo) {
		if (roomNo < rooms.size()) {
			return rooms.get(roomNo);
		} else {
			return null;
		}
	}
}
