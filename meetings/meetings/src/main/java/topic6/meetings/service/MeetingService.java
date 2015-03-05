package topic6.meetings.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MeetingService {
	private DAOMeetings daoMeetings;

	// create meetings, query existing ones, cancel and update meetings.
	public MeetingService(DAOMeetings daoMeetings) {
		this.daoMeetings = daoMeetings;
	}

	// The following are the format in which the day and the times "from" and
	// "to" are expected:
	// day: yyyyMMdd --- example: 20151030 ---> 30/10/2015
	// hour: HHmm --- example: 0830 ---> 8:30hs
	public boolean addMeeting(String description, String day, String roomId,
			String from, String to) {
		boolean success = false;
		SimpleDateFormat completeDate = new SimpleDateFormat("yyyyMMdd HHmm");

		try {
			Calendar calendar = Calendar.getInstance();
			Date fromDate, toDate;
			long intRoomId;
			Room room;

			if (!roomId.equals("") && !day.equals("") && !roomId.equals("")
					&& !from.equals("") && !to.equals("")) {
				calendar.setTime(completeDate.parse(day + " " + from));
				fromDate = calendar.getTime();
				calendar.setTime(completeDate.parse(day + " " + to));
				toDate = calendar.getTime();

				intRoomId = Long.parseLong(roomId);
				room = daoMeetings.getRoom(intRoomId);
				if (!room.equals(null)) {
					daoMeetings.saveMeeting(new Meeting(description, room,
							fromDate, toDate));
					success = true;
				} else {
					success = false;
				}
			} else {
				success = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

	public long getIdMeetingByDesc(String meetingDesc) {
		return 0; // escribir este metodo!!!!!!!!
	}

	public String getStringMeeting(long meetingId) {
		return daoMeetings.getMeeting(meetingId).toString();
	}

	public Meeting getMeeting(long meetingId) {
		return daoMeetings.getMeeting(meetingId);
	}

	public boolean cancelMeeting(long meetingId) {
		if (daoMeetings.existsMeeting(meetingId)) {
			daoMeetings.cancelMeeting(meetingId);
			return true;
		} else {
			return false;
		}
	}

	public boolean updateMeeting(long meetingId, String description,
			String roomId, String day, String from, String to) {
		boolean success = false;
		SimpleDateFormat completeDate = new SimpleDateFormat("yyyyMMdd HHmm");
		SimpleDateFormat HHmm = new SimpleDateFormat("HHmm");
		SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		Date fromDate, toDate;

		Meeting oldMeeting = getMeeting(meetingId);

		try {
			if (!oldMeeting.equals(null)) {
				if (!description.equals("")) {
					daoMeetings.setMeetingDesc(meetingId, description);
				}
				if (!roomId.equals("")) {
					daoMeetings.setMeetingRoom(meetingId,
							Long.parseLong(roomId));
				}
				if (day.equals("")) {
					day = yyyyMMdd.format(oldMeeting.getFromHour());
				}
				if (from.equals("")) {
					from = HHmm.format(oldMeeting.getFromHour());
				}
				calendar.setTime(completeDate.parse(day + " " + from));
				fromDate = calendar.getTime();
				daoMeetings.setMeetingStart(meetingId, fromDate);
				if (to.equals("")) {
					to = HHmm.format(oldMeeting.getToHour());
				}
				calendar.setTime(completeDate.parse(day + " " + to));
				toDate = calendar.getTime();
				daoMeetings.setMeetingFinish(meetingId, toDate);
				success = true;
			} else {
				success = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

	public boolean addAttendeeToMeeting(long meetingId, long attendeeId) {
		if (daoMeetings.existsAttendee(attendeeId)
				&& daoMeetings.existsMeeting(meetingId)) {
			daoMeetings.addAttendeeToMeeting(meetingId, attendeeId);
			return true;
		} else {
			return false;
		}

	}

}
