package topic6.actuator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topic6.actuator.entities.Atendee;
import topic6.actuator.implementation.AtendeeImp;

@Controller
@Component
@RequestMapping("/atendees")
public class AtendeeController {
	@Autowired
	private AtendeeImp service;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Atendee> createAttendee(@RequestBody Atendee atendee) {

		Atendee a = service.add(atendee);
		if (a != null)
			return new ResponseEntity<Atendee>(a, HttpStatus.CREATED);
		else
			return new ResponseEntity<Atendee>(a, HttpStatus.BAD_REQUEST);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Atendee> readAttendee(@PathVariable Integer id) {
		Atendee a = service.getAtendee(id);
		if (a != null)
			return new ResponseEntity<Atendee>(a, HttpStatus.OK);
		else
			return new ResponseEntity<Atendee>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@ResponseBody
	public List<Atendee> getAll() {
		return service.getAtendees();
	}
}
