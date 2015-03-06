package topic6.services;

import java.util.List;

import topic6.model.Meeting;

public interface MeetingService {

	public Meeting create(Meeting meeting);

	public Meeting read(Long id);

	public Meeting update(Meeting meeting);

	public void cancel(Long id);

	public List<Meeting> findAll();

	public boolean exists(Long id);
}
