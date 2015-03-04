package com.globant.app.actuator.services.implementation;

import com.globant.app.actuator.domain.entities.Meeting;
import com.globant.app.actuator.repositories.IMeetingRepo;
import com.globant.app.actuator.services.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MeetingService implements IMeetingService {

	@Autowired
	private IMeetingRepo meetingRepo;

	@Override public Meeting create(Meeting meeting) {
		Meeting newMeeting = meetingRepo.save(meeting);

		return newMeeting;
	}

	@Override public boolean delete(int id) {
		return meetingRepo.delete(id);
	}

	@Override public boolean update(Meeting meeting) {
		return meetingRepo.update(meeting);
	}

	@Override public Meeting get(int id) {
		return meetingRepo.get(id);
	}

	@Override public Collection<Meeting> all() {
		return meetingRepo.all();
	}
}
