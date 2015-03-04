package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import repositories.MeetingsRepository;
import classes.Meeting;
import exceptions.InvalideRepoException;

@Service
public class MeetingServiceImp implements MeetingService {

	MeetingsRepository meetingRepository;

	@Autowired
	public MeetingServiceImp(MeetingsRepository meetingsRepository) {
		this.meetingRepository = meetingRepository;
	}

	@Override
	public void addMeeting(Meeting m) {
		validateRepo(meetingRepository);
		meetingRepository.addMeeting(m);

	}

	@Override
	public void deleteMeeting(Long id) {
		validateRepo(meetingRepository);
		meetingRepository.delete(id);

	}

	@Override
	public Meeting getMeeting(Long id) {
		validateRepo(meetingRepository);
		return meetingRepository.getOneMeeting(id);
	}

	@Override
	public Meeting updateMeeting(Meeting m) {
		validateRepo(meetingRepository);
		return meetingRepository.updateMeeting(m);
	}

	@Override
	public List<Meeting> getAllMeetings() {
		validateRepo(meetingRepository);
		return meetingRepository.findAll();
	}

	@Override
	public Meeting create(Meeting m) {
		validateRepo(meetingRepository);
		return meetingRepository.create(m);
	}

	@Override
	public Meeting findMeetingById(Long id) {
		validateRepo(meetingRepository);
		return meetingRepository.findOne(id);
	}

	private void validateRepo(MeetingsRepository meetingRepo) {
		if (meetingRepo == null)
			try {
				throw new InvalideRepoException();
			} catch (InvalideRepoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
