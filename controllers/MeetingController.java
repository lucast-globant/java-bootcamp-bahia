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

import topic6.entities.Meeting;
import topic6.repositories.MeetingRepository;

@RestController
@RequestMapping ("/meeting")
public class MeetingController {
	
	@Autowired
	private MeetingRepository meetingRepository;

	 @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Meeting> meetings () {
		 return meetingRepository.findAll();
	 }

	 @RequestMapping(value = "/{meetingId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Meeting> getMeeting(@PathVariable int meetingId) {
		 Meeting meeting = meetingRepository.findById(meetingId);
	     ResponseEntity<Meeting> response;
	     if (meeting == null) {
	    	 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     } else {
	    	 response = new ResponseEntity<>(meeting, HttpStatus.OK);
	     }
	     return response;
	 }

	 @RequestMapping(method = RequestMethod.POST)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void insertMeeting(@RequestBody Meeting meeting) {
		 meetingRepository.create(meeting);
	 }

	 @RequestMapping(value = "/{meetingId}", method = RequestMethod.PUT)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void updateMeeting(@PathVariable int meetingId, @RequestBody Meeting meeting) {
		 Meeting meetingOld = meetingRepository.findById(meetingId);
	     if (meetingOld != null) {
	    	 meetingRepository.update(meetingOld.copyFrom(meeting));
	     }
	 }

	 @RequestMapping(value = "/{meetingId}", method = RequestMethod.DELETE)
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public void deleteMeeting(@PathVariable int meetingId) {
		 meetingRepository.cancel(meetingId);
	 }

}
