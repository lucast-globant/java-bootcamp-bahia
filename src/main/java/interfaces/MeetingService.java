package interfaces;

import org.springframework.stereotype.Component;

import entities.Meeting;

@Component
public interface MeetingService {
		public Meeting add(Meeting meeting);
		public Meeting remove(int idMeeting);
		public Meeting update(Meeting meeting);
		public Meeting getMeeting(int idMeeting);
		public String toString();

		

}
