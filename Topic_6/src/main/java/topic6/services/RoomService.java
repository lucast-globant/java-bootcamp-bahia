package topic6.services;

import java.util.List;

import topic6.model.Room;

public interface RoomService {

	public Room create(Room room);

	public Room read(Long id);

	public List<Room> findAll();
}
