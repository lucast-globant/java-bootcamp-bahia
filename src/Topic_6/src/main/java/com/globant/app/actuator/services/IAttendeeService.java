package com.globant.app.actuator.services;

import com.globant.app.actuator.domain.entities.Attendee;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface IAttendeeService {

	Collection<Attendee> all();
}
