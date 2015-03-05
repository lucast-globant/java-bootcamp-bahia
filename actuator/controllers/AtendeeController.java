package topic6.actuator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import topic6.actuator.entities.Atendee;
import topic6.actuator.implementation.AtendeeImp;

@Controller
@RequestMapping("/atendees")
public class AtendeeController {
	@Autowired
	private AtendeeImp service;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Atendee> createAttendee(@RequestBody Atendee atendee) {
		Atendee a = service.add(atendee);
		return new ResponseEntity<Atendee>(a, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Atendee> readAttendee(@PathVariable Integer id) {
		Atendee a = service.getAtendee(id);
		if (a != null)
			return new ResponseEntity<Atendee>(a, HttpStatus.OK);
		else
			return new ResponseEntity<Atendee>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Atendee> getAll() {
		return service.getAtendees();
	}
}
