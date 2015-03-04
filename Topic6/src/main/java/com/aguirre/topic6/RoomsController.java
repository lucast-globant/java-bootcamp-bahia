package com.aguirre.topic6;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

	private RoomRepository roomRepository;

	public RoomsController(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String readRooms() {
		List<Room> rooms = roomRepository.findAll();
		Gson gson = new Gson();
		return gson.toJson(rooms);
	}

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public String readRoom(@PathVariable Long roomId) {
		Room room = findRoomById(roomId);
		Gson gson = new Gson();
		return gson.toJson(room);
	}

	private Room findRoomById(Long id) {
		Room room = roomRepository.findOne(id);
		if (room == null) {
			throw new RoomNotFoundException(id);
		}
		return room;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	class RoomNotFoundException extends RuntimeException {

		public RoomNotFoundException(Long roomId) {
			super("Couldn't find room: " + roomId + ".");
		}
	}
}
