package topic6.services;

import java.util.List;

import org.springframework.stereotype.Service;

import topic6.entities.Meeting;
import topic6.repositories.MeetingRepository;

@Service
public class MeetingServicesImp implements MeetingService {
	
	private MeetingRepository meetingRepository;
	

	@Override
	public void create(Meeting meeting) {
		 meetingRepository.create(meeting);
	}

	@Override
	public void cancel(int id) {
		 meetingRepository.cancel(id);
	}

	@Override
	public void update(Meeting meeting) {
		 meetingRepository.update(meeting);
	}

	@Override
	public Meeting findById(int id) {
		 return meetingRepository.findById(id);
	}

	@Override
	public List<Meeting> findAll() {
		return  meetingRepository.findAll();
	}

}
