package com.globant.app.actuator.services.implementation;

import com.globant.app.actuator.domain.entities.Attendee;
import com.globant.app.actuator.repositories.IAttendeeRepo;
import com.globant.app.actuator.services.IAttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class AttendeeService implements IAttendeeService {

	@Autowired
	private IAttendeeRepo attendeeRepo;

	@Override public Collection<Attendee> all() {
		return attendeeRepo.all();
	}
}
