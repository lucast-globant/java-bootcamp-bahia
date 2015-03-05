package demo;

import java.util.ArrayList;
import java.util.List;


public class RoomRepository {
	
	private List<Room> rooms;
	
	public RoomRepository(){
		rooms= new ArrayList<Room>();
		rooms.add(new Room("Room 1",10));
		rooms.add(new Room("Room 2",20));
		rooms.add(new Room("Room 3",30));
		rooms.add(new Room("Room 4",40));
	}
	
	public int getSize(){
		return rooms.size();
	}
	
	public Room getRoom(int index){
		return rooms.get(index);
	}
	
	public void addRoom(Room room){
		rooms.add(room);
	}
	
	public void removeRoom(Room room){
		rooms.remove(room);
	}
}
