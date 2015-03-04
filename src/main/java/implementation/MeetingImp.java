package implementation;

import interfaces.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Database;
import entities.Meeting;

@Component
public class MeetingImp implements MeetingService {
	@Autowired
	Database db = Database.getInstance();

	@Override
	public Meeting add(Meeting meeting) {
		return db.put(meeting);
	}

	@Override
	public Meeting remove(int idMeeting) {
		return db.remove(idMeeting);
	}

	@Override
	public Meeting update(Meeting meeting) {
		return db.update(meeting);
	}

	@Override
	public Meeting getMeeting(int idMeeting) {
		return db.get(idMeeting);
	}

}
