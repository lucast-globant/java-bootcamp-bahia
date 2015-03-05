package topic6.actuator.controllers;

import java.util.List;

import topic6.actuator.interfaces.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import topic6.actuator.entities.Meeting;

@Controller
@RequestMapping("/meetings")
public class MeetingController {
	@Autowired
	private MeetingService meetings;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Meeting> createMeeting(@RequestBody Meeting meeting) {
		Meeting m = meetings.add(meeting);
		return new ResponseEntity<Meeting>(m, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Meeting> readMeeting(@PathVariable Integer id) {
		Meeting m = meetings.getMeeting(id);
		if (m != null)
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Meeting> updateMeeting(@RequestBody Meeting meeting) {
		if (meetings.getMeeting(meeting.getMeetingID()) != null) {
			Meeting m = meetings.update(meeting);
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Meeting> cancelMeeting(@PathVariable Integer id) {
		if (meetings.remove(id) != null) {
			return new ResponseEntity<Meeting>(HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Meeting> getAll() {
		return meetings.getMeetings();
	}
}
