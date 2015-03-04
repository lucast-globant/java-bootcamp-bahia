package topic6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import topic6.model.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Long>{
	
}
