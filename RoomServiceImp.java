package topic6;

import org.springframework.stereotype.Service;

import topic6.entities.Room;
import topic6.services.RoomService;

import java.util.Arrays;
import java.util.List;

@Service
public class RoomServiceImp implements RoomService {
	
	 private static final int id_1 = 1;
	 private static final int id_2 = 2;
	 private static final int id_3 = 3;
	 private static final String name_1 = "Juan Perez";
	 private static final String name_2 = "Maria Garcia";
	 private static final String name_3 = "Jose Cala";
	 private static final int capacity_1 = 25;
	 private static final int capacity_2 = 50;
	 private static final int capacity_3 = 200;
	 
	@Override
	public Room findById(int id) {
		return new Room()
        .setId(id)
        .setName(name_1)
        .setCapacity(capacity_1);
	}

	@Override
	public List<Room> findAll() {
        return Arrays.asList(
                new Room()
                	.setId(id_1)
                	.setName(name_1)
                	.setCapacity(capacity_1),
                new Room()
                	.setId(id_2)
                	.setName(name_2)
                	.setCapacity(capacity_2),
                new Room()
                	.setId(id_3)
                	.setName(name_3)
                	.setCapacity(capacity_3)
        );
	}

	@Override
	public Room save(Room room) {
	    return room.setId(id_1);
	}

	@Override
	public Room update(Room room) {
		return room;
	}

	@Override
	public void delete(int id) {
		//delete user by id
	}

}
