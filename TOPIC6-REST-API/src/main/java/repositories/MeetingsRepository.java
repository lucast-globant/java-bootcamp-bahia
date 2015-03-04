package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.Meeting;

public interface MeetingsRepository extends JpaRepository<Meeting, Long> {

	public List<Meeting> findAll();

	public void removeByDecription(String description);

	public void addMeeting(Meeting meeting);

	public Meeting getOneMeeting(Long id);

	public Meeting updateMeeting(Meeting meeting);

	public Meeting create(Meeting m);

}
