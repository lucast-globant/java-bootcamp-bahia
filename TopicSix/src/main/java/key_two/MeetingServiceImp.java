package key_two;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImp implements MeetingService {

	@Autowired
	private final MeetingRepository meetingRepository;
	
	@Autowired
	MeetingServiceImp(MeetingRepository meetingRepository) {
		this.meetingRepository = meetingRepository;

	}
	
	@Override
	public Meeting create(Meeting meeting) {
		return meetingRepository.save(meeting);
	}

	@Override
	public void cancel(Long id) {
		meetingRepository.delete(meetingRepository.findById(id));
	}

	@Override
	public List<Meeting> getAll() {
		return meetingRepository.findAll();
	}

	@Override
	public Meeting update(Meeting meeting) {
		cancel(meeting.getId());
		return create(meeting);
	}

}
