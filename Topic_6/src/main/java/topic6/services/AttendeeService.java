package topic6.services;

import java.util.List;

import topic6.model.Attendee;

public interface AttendeeService {

	public Attendee create(Attendee attendee);

	public Attendee read(Long id);

	public List<Attendee> findAll();
}
