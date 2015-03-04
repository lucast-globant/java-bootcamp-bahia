package key_two;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/meetings")
class MeetingRestController {

	@Autowired
	private MeetingService meetingService;

	public MeetingRestController(){
	}
	
	public MeetingRestController(MeetingService meetingService) {
		this.meetingService = meetingService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Meeting> showMeetings() {
		return this.meetingService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Meeting input) {
		meetingService.create(input);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{meetingId}")
				.buildAndExpand(input.getId()).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{meetingId}", method = RequestMethod.DELETE)
	public void cancel(@PathVariable("meetingId") Long id) {
		meetingService.cancel(id);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Meeting update(@RequestBody Meeting meeting) {
		return meetingService.update(meeting);
	}
}
