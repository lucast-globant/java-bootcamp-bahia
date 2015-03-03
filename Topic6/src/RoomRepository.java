package meetingPack;

import java.util.ArrayList;
import java.util.List;


public class RoomRepository {
	
	private List<Room> store;
	
	public RoomRepository(){
		store= new ArrayList<Room>();
		store.add(new Room("Room One",60,2,4));
		store.add(new Room("Room Two",60,2,4));
		store.add(new Room("Room Three",40,2,4));
		store.add(new Room("Room Four",40,2,4));
	}
	
	public int getSize(){
		return store.size();
	}
	
	public Room getRoom(int index){
		return store.get(index);
	}
	
	public void addRoom(Room room){
		store.add(room);
	}
	
	public void removeRoom(Room room){
		store.remove(room);
	}
}
