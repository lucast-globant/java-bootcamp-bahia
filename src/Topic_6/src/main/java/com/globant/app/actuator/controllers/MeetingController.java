package com.globant.app.actuator.controllers;

import com.globant.app.actuator.domain.entities.Meeting;
import com.globant.app.actuator.domain.validators.IMeetingValidator;
import com.globant.app.actuator.services.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Collection;

@Controller
@RequestMapping("/meetings")
public class MeetingController {

	@Autowired
	private IMeetingService meetingService;

	@Autowired
	private IMeetingValidator meetingValidator;

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder){
		binder.setValidator(meetingValidator);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Meeting create(@RequestBody @Valid Meeting meeting) {
		Meeting newMeeting = meetingService.create(meeting);

		return newMeeting;
	}

	@RequestMapping(value = "")
	@ResponseBody
	public Collection<Meeting> all() {
		return meetingService.all();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Meeting> get(@PathVariable Integer id) {
		Meeting meeting = meetingService.get(id);

		if (meeting == null)
			return new ResponseEntity<Meeting>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<Meeting>(meeting, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		boolean delete = meetingService.delete(id);

		if (!delete)
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
