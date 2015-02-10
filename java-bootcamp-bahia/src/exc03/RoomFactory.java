package exc03;


/* Abstract factory for rooms in the hospital*/

public class RoomFactory {

	public Room getRoom(String type) {
		
		if(type.equals("ER"))
			return new EmergenyRoom();
		
		if(type.equals("CR"))
			return new CommonRoom();
		
		return null;
	}
}
