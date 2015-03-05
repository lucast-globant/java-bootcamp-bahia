package topic6.meetings.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meeting")
public class MeetingController {
	MeetingService meetingService;

	public MeetingController() {
		this.meetingService = new MeetingService(new InMemoryDAO());
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addMeetingByGET(
			@RequestParam(value = "desc") String description,
			@RequestParam(value = "day") String day,
			@RequestParam(value = "room") String roomId,
			@RequestParam(value = "from") String from,
			@RequestParam(value = "to") String to) {
		if (meetingService.addMeeting(description, day, roomId, from, to)) {
			return ("New meeting added.");
		} else {
			return ("There was an error. Meeting has not been added.");
		}
	}

	@RequestMapping(value = "/{meetingId}", method = RequestMethod.GET)
	public String getStringMeetingByGET(@PathVariable Long meetingId) {
		String meeting = meetingService.getStringMeeting(meetingId);
		return meeting;
	}

	@RequestMapping(value = "/json={meetingId}", method = RequestMethod.GET)
	public ResponseEntity<Meeting> getJsonMeetingByGET(
			@PathVariable Long meetingId) {
		Meeting meeting = meetingService.getMeeting(meetingId);
		return new ResponseEntity<Meeting>(meeting, HttpStatus.OK);
	}

	@RequestMapping(value = "/cancel/{meetingId}", method = RequestMethod.GET)
	public String deleteMeetingByGET(@PathVariable Long meetingId) {
		if (meetingService.cancelMeeting(meetingId)) {
			return ("Meeting canceled.");
		} else {
			return ("There was an error. Meeting has not been canceled.");
		}
	}

	@RequestMapping(value = "/update/{meetingId}", method = RequestMethod.GET)
	public String updateMeetingByGET(
			@PathVariable Long meetingId,
			@RequestParam(value = "desc", defaultValue = "") String description,
			@RequestParam(value = "day", defaultValue = "") String day,
			@RequestParam(value = "room", defaultValue = "") String roomId,
			@RequestParam(value = "from", defaultValue = "") String from,
			@RequestParam(value = "to", defaultValue = "") String to) {
		if (meetingService.updateMeeting(meetingId, description, roomId, day,
				from, to)) {
			return ("Meeting updated.");
		} else {
			return ("There was an error. Meeting has not been updated.");
		}
	}

	@RequestMapping(value = "/add/{meetingId}/{attendeeId}", method = RequestMethod.GET)
	public String addAttendeeToMeetingByGET(@PathVariable Long meetingId,@PathVariable Long attendeeId) {
		if (meetingService.addAttendeeToMeeting(meetingId, attendeeId)){
			return ("Meeting updated.");
		} else {
			return ("There was an error. Attendee has not been added to Meeting.");
		}
	}
}