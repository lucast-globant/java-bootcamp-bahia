package topic6.actuator.controllers;

import java.util.List;

import topic6.actuator.interfaces.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topic6.actuator.entities.Meeting;

@Controller
@Component
@RequestMapping("/meetings")
public class MeetingController {
	@Autowired
	private MeetingService meetings;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Meeting> createMeeting(@RequestBody Meeting meeting) {
		Meeting m = meetings.add(meeting);
		return new ResponseEntity<Meeting>(m, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Meeting> readMeeting(@PathVariable Integer id) {
		Meeting m = meetings.getMeeting(id);
		if (m != null)
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Meeting> updateMeeting(@RequestBody Meeting meeting) {
		if (meetings.getMeeting(meeting.getId()) != null) {
			Meeting m = meetings.update(meeting);
			return new ResponseEntity<Meeting>(m, HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Meeting> cancelMeeting(@PathVariable Integer id) {
		if (meetings.remove(id) != null) {
			return new ResponseEntity<Meeting>(HttpStatus.OK);
		} else
			return new ResponseEntity<Meeting>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@ResponseBody
	public List<Meeting> getAll() {
		return meetings.getMeetings();
	}
}
