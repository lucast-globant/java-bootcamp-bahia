package controllers;


import interfaces.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.Meeting;

@Controller
@RequestMapping("/meetings")
public class MeetingController {
	@Autowired
	private MeetingService service;

	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public Meeting create(@RequestBody Meeting meeting) {
		return service.add(meeting);

	}

	@RequestMapping(value ="/get",method= RequestMethod.GET)
	@ResponseBody
	public String get(@RequestBody Meeting meeting) {
		return service.toString();
	}

	@RequestMapping(value="/delete/{id}",method= RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Void> delete(@PathVariable int idMeeting) {
		if (service.remove(idMeeting) != null)
			return new ResponseEntity<Void>(HttpStatus.OK);
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
