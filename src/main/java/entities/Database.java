package entities;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private Map<Integer, Room> rooms;
	private Map<Integer, Atendee> atendees;
	private Map<Integer, Meeting> meetings;
	private static Database db = new Database();

	private Database() {
		rooms = new HashMap<Integer, Room>();
		atendees = new HashMap<Integer, Atendee>();
		meetings = new HashMap<Integer, Meeting>();
	}

	public Map<Integer, Room> getRooms() {
		return rooms;
	}

	public Map<Integer, Atendee> getAtendees() {
		return atendees;
	}

	public Map<Integer, Meeting> getMeetings() {
		return meetings;
	}

	public static Database getInstance() {
		return db;
	}

	public Meeting put(Meeting meeting) {

		return meetings.put(meeting.getMeetingID(), meeting);
	}

	public Meeting remove(int idMeeting) {

		return meetings.remove(idMeeting);
	}

	public Meeting update(Meeting meeting) {
		meetings.remove(meeting.getMeetingID());
		return meetings.put(meeting.getMeetingID(), meeting);
	}

	public Meeting get(int idMeeting) {

		return meetings.get(idMeeting);
	}

}
