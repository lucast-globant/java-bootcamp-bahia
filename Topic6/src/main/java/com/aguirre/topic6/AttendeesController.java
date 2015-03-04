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
@RequestMapping("/attendees")
public class AttendeesController {

	private AttendeeRepository attendeeRepository;

	public AttendeesController(AttendeeRepository attendeeRepository) {
		this.attendeeRepository = attendeeRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String readAttendees() {
		List<Attendee> attendees = attendeeRepository.findAll();
		Gson gson = new Gson();
		return gson.toJson(attendees);
	}

	@RequestMapping(value = "/{attendeeId}", method = RequestMethod.GET)
	public String readAttendee(@PathVariable Long attendeeId) {
		Attendee attendee = findAttendeeById(attendeeId);
		Gson gson = new Gson();
		return gson.toJson(attendee);
	}

	private Attendee findAttendeeById(Long id) {
		Attendee attendee = attendeeRepository.findOne(id);
		if (attendee == null) {
			throw new AttendeeNotFoundException(id);
		}
		return attendee;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	class AttendeeNotFoundException extends RuntimeException {

		public AttendeeNotFoundException(Long attendeeId) {
			super("Couldn't find attendee: " + attendeeId + ".");
		}
	}
}
