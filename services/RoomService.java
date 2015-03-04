package topic6.services;

import java.util.List;

import topic6.entities.Room;

public interface RoomService {
	
    public Room findById(int id);

    public List<Room> findAll();

    public Room save(Room room);

    public Room update(Room room);

    public void delete(int id);

}
