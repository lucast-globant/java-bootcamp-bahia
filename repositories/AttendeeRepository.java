package topic6.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import topic6.entities.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

	public List<Attendee> findAll();

}
