package com.globant.app.actuator.repositories.implementation;

import com.globant.app.actuator.domain.entities.Attendee;
import com.globant.app.actuator.repositories.IAttendeeRepo;
import org.springframework.stereotype.Component;

@Component
public class AttendeeRepo extends GenericRepo<Attendee> implements IAttendeeRepo {

	public AttendeeRepo() {
		for (int i = 0; i < 5; i++)
			save(new Attendee("name" + i, "lastName" + i));
	}
}
