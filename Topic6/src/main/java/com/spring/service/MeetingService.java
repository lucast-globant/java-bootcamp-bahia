package com.spring.service;

import java.util.List;

import com.spring.model.Meeting;

public interface MeetingService {

	public void createMeeting(Meeting meeting);
	public void removeMeeting(Long id); 
	public Meeting getMeeting(Long id); 
	public void cancelMeeting(Long id);
	public Boolean getStatus(Long id);
	public void updateMeeting(Meeting meeting); 
	public List<Meeting> getMeetings();
	
}
