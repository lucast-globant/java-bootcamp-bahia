package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import classes.Room;
import repositories.RoomsRepository;
import services.MeetingService;

@RestController
public class RoomController {
	@Autowired
	private RoomsRepository roomRepository;

	@Autowired
	public RoomController(RoomsRepository roomRepository) {
		validateResponseEntity(roomRepository);
		this.roomRepository = roomRepository;
	}

	@RequestMapping("/rooms")
	public List<Room> rooms() {
		validateResponseEntity(roomRepository);
		return this.roomRepository.findAll();
	}

	private ResponseEntity<RoomsRepository> validateResponseEntity(@RequestBody RoomsRepository roomRepository) {

		if (roomRepository == null)
			return new ResponseEntity<RoomsRepository>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<RoomsRepository>(HttpStatus.OK);
	}
}