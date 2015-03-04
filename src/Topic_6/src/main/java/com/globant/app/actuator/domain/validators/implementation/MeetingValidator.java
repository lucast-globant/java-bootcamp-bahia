package com.globant.app.actuator.domain.validators.implementation;

import com.globant.app.actuator.domain.entities.Attendee;
import com.globant.app.actuator.domain.entities.Meeting;
import com.globant.app.actuator.domain.entities.Room;
import com.globant.app.actuator.domain.validators.IMeetingValidator;
import com.globant.app.actuator.repositories.IAttendeeRepo;
import com.globant.app.actuator.repositories.IRoomsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.util.ArrayList;
import java.util.List;

@Component
public class MeetingValidator implements IMeetingValidator{

	@Autowired
	private IRoomsRepo roomsRepo;

	@Autowired
	private IAttendeeRepo attendeeRepo;

	@Override public boolean supports(Class<?> aClass) {
		return Meeting.class.isAssignableFrom(aClass);
	}

	@Override public void validate(Object object, Errors errors) {
		Meeting meeting = (Meeting) object;

		// Validate time slot
		if(meeting.getStart().compareTo(meeting.getEnd()) > 0)
			errors.rejectValue("start", "Start time is greater than end time");

		// Validate rooms
		List<Room> validatedRooms = new ArrayList<Room>();

		for (Room room : meeting.getRooms()) {
			Room repoRoom = roomsRepo.get(room.getId());
			if (repoRoom == null)
				errors.rejectValue("rooms", "Room does not exist");
			else
				validatedRooms.add(repoRoom);
		}

		meeting.setRooms(validatedRooms);

		// Validate attendees
		List<Attendee> validatedAttendees = new ArrayList<Attendee>();

		for (Attendee attendee : meeting.getAttendees()) {
			Attendee repoAttendee = attendeeRepo.get(attendee.getId());
			if (repoAttendee == null)
				errors.rejectValue("attendees", "Attendee does not exist");
			else
				validatedAttendees.add(repoAttendee);
		}

		meeting.setAttendees(validatedAttendees);
	}
}
