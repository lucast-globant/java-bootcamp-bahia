package com.globant.app.actuator.services.implementation;

import com.globant.app.actuator.domain.entities.Room;
import com.globant.app.actuator.repositories.IRoomsRepo;
import com.globant.app.actuator.services.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class RoomService implements IRoomService {

	@Autowired
	IRoomsRepo roomsRepo;

	@Override public Collection<Room> all() {
		return roomsRepo.all();
	}
}
