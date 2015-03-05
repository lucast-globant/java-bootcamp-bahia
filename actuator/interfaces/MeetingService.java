package topic6.actuator.interfaces;


import org.springframework.stereotype.Component;
import topic6.actuator.entities.Meeting;

import java.util.List;

@Component
public interface MeetingService {
		public Meeting add(Meeting meeting);
		public Meeting remove(int idMeeting);
		public Meeting update(Meeting meeting);
		public Meeting getMeeting(int idMeeting);
		public String toString();
        public List<Meeting> getMeetings();
		

}
