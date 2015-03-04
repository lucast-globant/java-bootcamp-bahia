package controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import classes.Attendee;
import repositories.AttendeesRepository;
import services.MeetingService;

@RestController
public class AttendeeController {
	@Autowired
	private AttendeesRepository AttendeeRepository;

	@Autowired
	public AttendeeController(AttendeesRepository AttendeeRepository) {
		validateResponseEntity(AttendeeRepository);
		this.AttendeeRepository = AttendeeRepository;
	}

	@RequestMapping("/Attendees")
	public List<Attendee> Attendees() {
		validateResponseEntity(AttendeeRepository);
		return this.AttendeeRepository.findAll();
	}

	private ResponseEntity<AttendeesRepository> validateResponseEntity(@RequestBody AttendeesRepository AttendeeRepository) {

		if (AttendeeRepository == null)
			return new ResponseEntity<AttendeesRepository>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<AttendeesRepository>(HttpStatus.OK);
	}
}
