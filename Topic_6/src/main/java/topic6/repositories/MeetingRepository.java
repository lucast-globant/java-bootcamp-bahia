package topic6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import topic6.model.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Long>{

}
