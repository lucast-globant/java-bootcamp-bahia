package com.globant.app.actuator.services;

import com.globant.app.actuator.domain.entities.Room;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface IRoomService {

	Collection<Room> all();
}
