package topic6.actuator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import topic6.actuator.entities.Room;
import topic6.actuator.interfaces.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	private RoomService rooms;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Room> createRoom(@RequestBody Room room) {
		Room r = rooms.add(room);
		return new ResponseEntity<Room>(r, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Room> readRoom(@PathVariable int id) {
		Room r = rooms.getRoom(id);
		if (r != null)
			return new ResponseEntity<Room>(r, HttpStatus.OK);
		else
			return new ResponseEntity<Room>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Room> getAll() {
		return rooms.getRooms();
	}
}
