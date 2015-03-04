package com.globant.app.actuator.repositories.implementation;

import com.globant.app.actuator.domain.entities.Room;
import com.globant.app.actuator.repositories.IRoomsRepo;
import org.springframework.stereotype.Component;

@Component
public class RoomsRepo extends GenericRepo<Room> implements IRoomsRepo {

	public RoomsRepo() {
		for (int i = 0; i < 5; i++)
			save(new Room("room" + i, 20 * i));
	}
}
