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

import topic6.entities.Attendee;
import topic6.services.AttendeeService;

@RestController
@RequestMapping ("/attendee")
public class AttendeeController {

	@Autowired
	private AttendeeService attendeeService;

	 @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Attendee> attendees () {
		 return attendeeService.findAll();
	 }

	 @RequestMapping(value = "/{attendeeDni}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Attendee> getAttendee(@PathVariable long attendeeDni) {
		 Attendee attendee = attendeeService.findByDni(attendeeDni);
	     ResponseEntity<Attendee> response;
	     if (attendee == null) {
	    	 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     } else {
	    	 response = new ResponseEntity<>(attendee, HttpStatus.OK);
	     }
	     return response;
	 }

	 @RequestMapping(method = RequestMethod.POST)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void insertAttendee(@RequestBody Attendee attendee) {
		 attendeeService.save(attendee);
	 }

	 @RequestMapping(value = "/{attendeeDni}", method = RequestMethod.PUT)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void updateAttendee(@PathVariable long attendeeDni, @RequestBody Attendee attendee) {
		 Attendee attendeeOld = attendeeService.findByDni(attendeeDni);
	     if (attendeeOld != null) {
	    	 attendeeService.update(attendeeOld.copyFrom(attendee));
	     }
	 }

	 @RequestMapping(value = "/{attendeeDni}", method = RequestMethod.DELETE)
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public void deleteattendee(@PathVariable long attendeeDni) {
		 attendeeService.delete(attendeeDni);
	 }

}

