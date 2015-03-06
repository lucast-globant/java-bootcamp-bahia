package topic6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic6.model.Meeting;
import topic6.repositories.MeetingRepository;

@Service
public class MeetingServiceImp implements MeetingService {
	@Autowired
	private MeetingRepository meetings;

	@Override
	public Meeting create(Meeting meeting) {
		return meetings.save(meeting);
	}

	@Override
	public Meeting read(Long id) {
		return meetings.findOne(id);
	}

	@Override
	public Meeting update(Meeting meeting) {
		return meetings.saveAndFlush(meeting);
	}

	@Override
	public void cancel(Long id) {
		meetings.delete(id);
	}

	@Override
	public List<Meeting> findAll() {
		return meetings.findAll();
	}

	@Override
	public boolean exists(Long id) {
		return meetings.exists(id);
	}

}
