package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomRestController {
	@Autowired
	private RoomRepository room_repository;

	@Autowired
	public RoomRestController(RoomRepository room_repository) {
		this.room_repository = room_repository;
	}

	@RequestMapping("/rooms")
	public List<Room> rooms() {
		return this.room_repository.findAll();
	}
}
