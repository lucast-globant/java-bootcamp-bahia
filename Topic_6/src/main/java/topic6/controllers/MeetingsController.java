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

import topic6.model.Meeting;
import topic6.services.MeetingService;

@RestController
@RequestMapping("/meetings")
public class MeetingsController {
	@Autowired
	private MeetingService meetings;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Meeting> createMeeting(@RequestBody Meeting meeting) {
		Meeting m = meetings.create(meeting);
		return new ResponseEntity<Meeting>(m, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Meeting> readMeeting(@PathVariable Long id) {
		Meeting m = meetings.read(id);
		if (m != null)
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Meeting> updateMeeting(@RequestBody Meeting meeting) {
		if (meetings.exists(meeting.getId())) {
			Meeting m = meetings.update(meeting);
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Meeting> cancelMeeting(@PathVariable Long id) {
		if (meetings.exists(id)) {
			meetings.cancel(id);
			return new ResponseEntity<Meeting>(HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Meeting> getAll() {
		return meetings.findAll();
	}

}
