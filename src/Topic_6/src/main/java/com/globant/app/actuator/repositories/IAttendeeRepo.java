package com.globant.app.actuator.repositories;

import com.globant.app.actuator.domain.entities.Attendee;
import org.springframework.stereotype.Component;

@Component
public interface IAttendeeRepo extends IRepository<Attendee> {
}
