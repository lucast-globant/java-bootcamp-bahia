package com.globant.app.actuator.repositories.implementation;

import com.globant.app.actuator.domain.entities.Meeting;
import com.globant.app.actuator.repositories.IMeetingRepo;
import org.springframework.stereotype.Component;

@Component
public class MeetingRepo extends GenericRepo<Meeting> implements IMeetingRepo {
}
