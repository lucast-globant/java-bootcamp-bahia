package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import classes.Meeting;
import repositories.MeetingsRepository;
import services.MeetingService;

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {

	private MeetingService meetingService;

	@Autowired
	public MeetingController(MeetingService meetingService) {
		this.meetingService = meetingService;
	}

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> create(@RequestBody Meeting meeting) {
		Meeting newMeeting = meetingService.create(meeting);
		
		if (newMeeting == null)
					return new ResponseEntity<Meeting>(HttpStatus.INTERNAL_SERVER_ERROR);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(meeting.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Meeting> meetings() {
		validateMeetingService(meetingService);
		List<Meeting> todoEntries = meetingService.getAllMeetings();
		return todoEntries;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Meeting meeting(@PathVariable("id") Long id) {
		validateMeetingService(meetingService);
		return meetingService.findMeetingById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void cancel(@PathVariable("id") Long id) {
		validateMeetingService(meetingService);
		meetingService.deleteMeeting(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Meeting update(@RequestBody Meeting meeting) {
		validateMeetingService(meetingService);
		return meetingService.updateMeeting(meeting);
	}

	private ResponseEntity<MeetingService> validateMeetingService(@RequestBody MeetingService meetingService) {

		if (meetingService == null)
			return new ResponseEntity<MeetingService>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<MeetingService>(HttpStatus.OK);
	}
}
