package topic6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic6.model.Attendee;
import topic6.repositories.AttendeeRepository;

@Service
public class AttendeeServiceImp implements AttendeeService {
	@Autowired
	private AttendeeRepository attendees;

	@Override
	public Attendee create(Attendee attendee) {
		return attendees.save(attendee);
	}

	@Override
	public Attendee read(Long id) {
		return attendees.findOne(id);
	}

	@Override
	public List<Attendee> findAll() {
		return attendees.findAll();
	}

}
