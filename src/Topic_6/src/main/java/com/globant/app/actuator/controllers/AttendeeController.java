package com.globant.app.actuator.controllers;

import com.globant.app.actuator.domain.entities.Attendee;
import com.globant.app.actuator.services.IAttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/attendees")
public class AttendeeController {

	@Autowired
	private IAttendeeService attendeeService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public Collection<Attendee> getAll() {
		return attendeeService.all();
	}
}
