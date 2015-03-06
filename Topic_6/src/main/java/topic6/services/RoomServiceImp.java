package topic6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic6.model.Room;
import topic6.repositories.RoomRepository;

@Service
public class RoomServiceImp implements RoomService {
	@Autowired
	private RoomRepository rooms;

	@Override
	public Room create(Room room) {
		return rooms.save(room);
	}

	@Override
	public Room read(Long id) {
		return rooms.findOne(id);
	}

	@Override
	public List<Room> findAll() {
		return rooms.findAll();
	}

}
