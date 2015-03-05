package topic6.actuator.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import topic6.actuator.entities.Database;
import topic6.actuator.entities.Meeting;
import topic6.actuator.interfaces.MeetingService;

import java.util.List;

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
		return db.getMeeting(idMeeting);
	}
    public List<Meeting> getMeetings(){
        return db.getMeetings();
    }




}
