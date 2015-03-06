
package topic6.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

	public List<Attendee> findAll();

}