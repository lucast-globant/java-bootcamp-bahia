package com.aguirre.topic6;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
@RequestMapping("/meetings")
public class MeetingsController {

	private final MeetingRepository meetingRepository;

	MeetingsController(MeetingRepository meetingRepository) {
		this.meetingRepository = meetingRepository;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String createMeeting(String jsonMeeting) {
		Gson gson = new Gson();
		// transform json string into a meeting
		Meeting newMeeting = gson.fromJson(jsonMeeting, Meeting.class);
		meetingRepository.save(newMeeting);
		return gson.toJson(newMeeting);
	}

	@RequestMapping(method = RequestMethod.POST)
	public String updateMeeting(String jsonMeeting) {
		Gson gson = new Gson();
		// transform json string into a meeting
		Meeting meetingUpdated = gson.fromJson(jsonMeeting, Meeting.class);
		// exist a meeting with that id, else a MeetingNotFoundExceptino is
		// thrown
		Meeting updated = findMeetingById(meetingUpdated.getId());
		updated.update(meetingUpdated.getMeetingName(), meetingUpdated.getAttendees(), meetingUpdated.getRoom(),
				meetingUpdated.getTimeSlot());
		return gson.toJson(updated);
	}

	@RequestMapping(value = "/{meetingId}", method = RequestMethod.GET)
	public String readMeeting(@PathVariable Long meetingId) {
		// exist a meeting with that id, else a MeetingNotFoundExceptino is
		// thrown
		Meeting meeting = findMeetingById(meetingId);
		Gson gson = new Gson();
		return gson.toJson(meeting);
	}

	@RequestMapping(value = "/{meetingId}", method = RequestMethod.DELETE)
	public String deleteMeeting(@PathVariable Long meetingId) {
		// exist a meeting with that id, else a MeetingNotFoundExceptino is
		// thrown
		Meeting meeting = findMeetingById(meetingId);
		meetingRepository.delete(meetingId);
		Gson gson = new Gson();
		return gson.toJson(meeting);
	}

	private Meeting findMeetingById(Long id) {
		Meeting meeting = meetingRepository.findOne(id);
		// doesn't exist a meeting with that id
		if (meeting == null) {
			throw new MeetingNotFoundException(id);
		}
		return meeting;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	class MeetingNotFoundException extends RuntimeException {

		public MeetingNotFoundException(Long meetingId) {
			super("Couldn't find meeting: " + meetingId + ".");
		}
	}
}
