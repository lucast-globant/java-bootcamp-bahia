package topic6.actuator.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import topic6.actuator.entities.Database;
import topic6.actuator.entities.Room;
import topic6.actuator.interfaces.RoomService;
@Service
@Component
public class RoomImp implements RoomService {
	@Autowired
    Database db = Database.getInstance();

	

	@Override
	public Room add(Room room) {
		// TODO Auto-generated method stub
		return db.put(room);
	}



	@Override
	public Room getRoom(Integer idRoom) {
		// TODO Auto-generated method stub
		return db.getRoom(idRoom);
	}



	@Override
	public List<Room> getRooms() {
		// TODO Auto-generated method stub
		return db.getRooms();
	}

}
