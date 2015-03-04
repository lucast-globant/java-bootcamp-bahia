package services;

import java.util.List;

import classes.Meeting;

public interface MeetingService {

	public void addMeeting(Meeting m);

	public void deleteMeeting(Long id);

	public Meeting getMeeting(Long id);

	public Meeting updateMeeting(Meeting m);

	public List<Meeting> getAllMeetings();

	public Meeting create(Meeting meeting);

	public Meeting findMeetingById(Long id);

}