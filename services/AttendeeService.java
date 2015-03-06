package topic6.services;

import java.util.List;

import topic6.repositories.Attendee;

public interface AttendeeService {
	
    public Attendee findByDni(long dni);

    public List<Attendee> findAll();

    public Attendee save(Attendee attendee);

    public Attendee update(Attendee attendee);

    public void delete(long dni);

}