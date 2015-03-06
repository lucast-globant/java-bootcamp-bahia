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

import topic6.model.Attendee;
import topic6.services.AttendeeService;

@RestController
@RequestMapping("/attendees")
public class AttendeesController {
	@Autowired
	private AttendeeService attendees;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Attendee> createAttendee(@RequestBody Attendee attendee) {
		Attendee a = attendees.create(attendee);
		return new ResponseEntity<Attendee>(a, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Attendee> readAttendee(@PathVariable Long id) {
		Attendee a = attendees.read(id);
		if (a != null)
			return new ResponseEntity<Attendee>(a, HttpStatus.OK);
		else
			return new ResponseEntity<Attendee>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Attendee> getAll() {
		return attendees.findAll();
	}
}
