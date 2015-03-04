package com.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.DataBase;
import com.spring.model.Meeting;
import com.spring.service.MeetingService;

@Service
public class MeetingImp implements MeetingService{

	private DataBase db = DataBase.getInstance();

	@Override
	public void createMeeting(Meeting meeting) {
		db.createMeeting(meeting);
	}
	
	@Override
	public void updateMeeting(Meeting meeting) {
		db.updateMeeting(meeting);
	}

	@Override
	public void removeMeeting(Long id) {
		db.removeMeeting(id);
	}

	@Override
	public Meeting getMeeting(Long id) {
		return db.getMeeting(id);
	}

	@Override
	public List<Meeting> getMeetings() {
		return db.getMeetings();
	}

	@Override
	public void cancelMeeting(Long id) {
		Meeting m = db.getMeeting(id);
		m.setStatus(false);
		db.updateMeeting(m);
	}

	@Override
	public Boolean getStatus(Long id) {
		Meeting m = db.getMeeting(id);
		return m.getStatus();
	}
	
}