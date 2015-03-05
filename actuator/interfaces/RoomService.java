package topic6.actuator.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import topic6.actuator.entities.Room;

@Component
public interface RoomService {
	

	public Room add(Room room);
	public Room getRoom(Integer idRoom);
	public List<Room> getRooms();

}
