package topic6.services;

import java.util.List;

import org.springframework.stereotype.Service;

import topic6.repositories.Meeting;
import topic6.repositories.MeetingRepository;

@Service
public class MeetingServicesImp implements MeetingService {
	
	private MeetingRepository meetingRepository;
	

	@Override
	public void create(Meeting meeting) {
		 meetingRepository.save(meeting);
	}

	@Override
	public void cancel (Meeting meeting) {
		 meetingRepository.delete(meeting);
	}

	@Override
	public void update(int meetingId, Meeting meeting) {
		Meeting meetingOld = meetingRepository.findById(meetingId);
		meetingOld.copyFrom(meeting);
		meetingRepository.save(meetingOld);
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