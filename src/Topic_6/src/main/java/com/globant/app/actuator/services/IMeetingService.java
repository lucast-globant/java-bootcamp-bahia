package com.globant.app.actuator.services;

import com.globant.app.actuator.domain.entities.Meeting;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface IMeetingService {

	Meeting create(Meeting meeting);

	boolean delete(int id);

	boolean update(Meeting meeting);

	Meeting get(int id);

	Collection<Meeting> all();

}
