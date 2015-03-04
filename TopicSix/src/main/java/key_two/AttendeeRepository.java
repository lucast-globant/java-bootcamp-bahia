package key_two;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long>{

	Optional<Attendee> findByName(String name);
}
