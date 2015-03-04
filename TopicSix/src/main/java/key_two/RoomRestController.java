package key_two;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
class RoomRestController {

	@Autowired
	private final RoomRepository roomRepository;

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	Room findRooms(@PathVariable Long roomId) {
		return this.roomRepository.findOne(roomId);
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<Room> showRooms() {
		return this.roomRepository.findAll();
	}

	@Autowired
	RoomRestController(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

}