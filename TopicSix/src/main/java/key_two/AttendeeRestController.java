package key_two;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendees")
class AttendeeRestController {

	@Autowired
	private final AttendeeRepository attendeeRepository;

	@RequestMapping(value = "/{attendeeId}", method = RequestMethod.GET)
	Attendee findAtendee(@PathVariable Long attendeeId) {
		return this.attendeeRepository.findOne(attendeeId);
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<Attendee> showAttendees() {
		return this.attendeeRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	void createAttendee(@RequestBody Attendee input){
		attendeeRepository.save(input);
	}

	@Autowired
	AttendeeRestController(AttendeeRepository atendeeRepository) {
		this.attendeeRepository = atendeeRepository;
	}

}
