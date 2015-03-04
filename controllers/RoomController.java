package topic6.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import topic6.entities.Room;
import topic6.services.RoomService;

@RestController
@RequestMapping ("/room")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	 @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Room> rooms () {
		 return roomService.findAll();
	 }

	 @RequestMapping(value = "/{roomId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Room> getRoom(@PathVariable int roomId) {
		 Room room = roomService.findById(roomId);
	     ResponseEntity<Room> response;
	     if (room == null) {
	    	 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     } else {
	    	 response = new ResponseEntity<>(room, HttpStatus.OK);
	     }
	     return response;
	 }

	 @RequestMapping(method = RequestMethod.POST)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void insertRoom(@RequestBody Room room) {
		 roomService.save(room);
	 }

	 @RequestMapping(value = "/{roomId}", method = RequestMethod.PUT)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void updateRoom(@PathVariable int roomId, @RequestBody Room room) {
		 Room roomOld = roomService.findById(roomId);
	     if (roomOld != null) {
	    	 roomService.update(roomOld.copyFrom(room));
	     }
	 }

	 @RequestMapping(value = "/{roomId}", method = RequestMethod.DELETE)
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public void deleteRoom(@PathVariable int roomId) {
		 roomService.delete(roomId);
	 }

}
