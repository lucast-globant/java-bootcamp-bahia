package topic6.actuator.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Database {
	AtomicInteger id = new AtomicInteger(0);
	private Map<Integer, Room> rooms;
	private Map<Integer, Atendee> atendees;
	private Map<Integer, Meeting> meetings;
	private static Database db = new Database();

	private Database() {
		rooms = new HashMap<Integer, Room>();
		atendees = new HashMap<Integer, Atendee>();
		meetings = new HashMap<Integer, Meeting>();

	}

	public List<Room> getRooms() {
		return new ArrayList<Room>(rooms.values());
	}

	public List<Atendee> getAtendees() {
		return new ArrayList<Atendee>(atendees.values());
	}

	public List<Meeting> getMeetings() {
		return new ArrayList<Meeting>(meetings.values());
	}

	public static Database getInstance() {
		return db;
	}

	public Meeting put(Meeting meeting) {
		int actual = this.id.incrementAndGet();
		meeting.setId(actual);
		return meetings.put(actual, meeting);
	}

	public Meeting remove(int idMeeting) {

		return meetings.remove(idMeeting);
	}

	public Meeting update(Meeting meeting) {
		meetings.remove(meeting.getId());
		Meeting m = meetings.put(meeting.getId(), meeting);
		if (m == null)
			return meeting;
		else
			return m;

	}

	public Meeting getMeeting(int idMeeting) {

		return meetings.get(idMeeting);
	}

	public Atendee put(Atendee atendee) {
		int actual = this.id.incrementAndGet();
		atendee.setId(actual);
		return atendees.put(actual, atendee);
	}

	public Atendee getAtendee(int idAtendee) {

		return atendees.get(idAtendee);
	}

	public Room getRoom(int idRoom) {

		return rooms.get(idRoom);
	}

	public Room put(Room room) {
		int actual = this.id.incrementAndGet();
		room.setId(actual);
		return rooms.put(actual, room);
	}

}
