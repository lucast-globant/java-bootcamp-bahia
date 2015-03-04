package topic6.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import topic6.model.Room;
import topic6.repositories.RoomRepository;

@RestController
@RequestMapping("/rooms")
public class RoomsController {
	@Autowired
	private RoomRepository rooms;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST,
			consumes="application/json") 
	public ResponseEntity<Room> createRoom(@RequestBody Room room) {
		Room r = rooms.save(room);
	    return new ResponseEntity<Room>(r, HttpStatus.CREATED); 
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Room> readRoom(@PathVariable Long id) {
		Room r = rooms.findOne(id);
		if(r != null) return new ResponseEntity<Room>(r,HttpStatus.OK);
		else return new ResponseEntity<Room>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Room> getAll(){
		return rooms.findAll();
	}
}
