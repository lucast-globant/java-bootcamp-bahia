package rest;
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

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {

	@Autowired
	private MeetingService meeting_service;

	@Autowired
	public MeetingController(MeetingService meeting_service) {
		this.meeting_service = meeting_service;
	}

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> create(@RequestBody Meeting meeting) {
		meeting_service.create(meeting);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(meeting.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Meeting> meetings() {
		List<Meeting> todoEntries = meeting_service.getMeetings();
		return todoEntries;
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Meeting meeting(@PathVariable("id") Long id) {
		return meeting_service.findMeetingById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void cancel (@PathVariable("id") Long id) {
		meeting_service.delete(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Meeting update (@RequestBody Meeting meeting) {
		return meeting_service.updateMeeting(meeting);
	}
}