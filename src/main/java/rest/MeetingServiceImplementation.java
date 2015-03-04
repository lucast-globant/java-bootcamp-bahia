package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImplementation implements MeetingService {

	private final MeetingRepository meeting_repository;

	@Autowired
	public MeetingServiceImplementation (MeetingRepository meeting_repository) {
		this.meeting_repository = meeting_repository;
	}	

	@Override
	public Meeting create(Meeting meeting) {
		return meeting_repository.save(meeting);
	}

	@Override
	public void delete(Long id) {
		Meeting meeting = findMeetingById(id);
		meeting_repository.delete(meeting);
	}

	@Override
	public List<Meeting> getMeetings() {
		return meeting_repository.findAll();
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		Meeting meeting_updated = findMeetingById(meeting.getId());
		meeting_updated.setAttendees(meeting.getAttendees());
		meeting_updated.setRoom(meeting.getRoom());
		meeting_updated.setTime_slot(meeting.getTime_slot());
		return meeting_updated;
	}

	@Override
	public Meeting findMeetingById(Long id) {
		Meeting meeting = meeting_repository.findOne(id);
		return meeting;
	}

}
