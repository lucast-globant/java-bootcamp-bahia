package implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Database;
import interfaces.RoomService;

@Component
public class RoomImp implements RoomService {
	@Autowired
	Database db = Database.getInstance();

	@Override
	public String toString() {
		return db.getRooms().toString();
	}

}
