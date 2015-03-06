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

import topic6.repositories.Meeting;
import topic6.services.MeetingService;
import topic6.services.MeetingServicesImp;

@RestController
@RequestMapping ("/meeting")
public class MeetingController {
	
	@Autowired
	private MeetingService meetingService;
	
	@Autowired
	public MeetingController () {
		this.meetingService = new MeetingServicesImp ();
	}
	
	@Autowired
	public MeetingController (MeetingService meetingService) {
		this.meetingService = meetingService;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void insertMeeting(@RequestBody Meeting meeting) {
		meetingService.create(meeting); 
	}
	
	@RequestMapping(value = "/{meetingId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMeeting(@PathVariable Meeting meeting) {
		 meetingService.cancel(meeting);
	}
	
	@RequestMapping(value = "/{meetingId}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public void updateMeeting(@PathVariable int meetingId, @RequestBody Meeting meeting) {
		Meeting meetingOld = meetingService.findById(meetingId);
	    if (meetingOld != null) {
	    	meetingService.update(meetingId, meeting);
	    }
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Meeting> meetings () {
		return meetingService.findAll();
	}

	@RequestMapping(value = "/{meetingId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Meeting> getMeeting(@PathVariable int meetingId) {
		 Meeting meeting = meetingService.findById(meetingId);
	     ResponseEntity<Meeting> response;
	     if (meeting == null) {
	    	 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     } else {
	    	 response = new ResponseEntity<>(meeting, HttpStatus.OK);
	     }
	     return response;
	}
}