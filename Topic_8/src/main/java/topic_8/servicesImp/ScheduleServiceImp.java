package topic_8.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic_8.model.Schedule;
import topic_8.repositories.ScheduleRepository;
import topic_8.services.ScheduleService;

@Service
public class ScheduleServiceImp implements ScheduleService {
	@Autowired
	private ScheduleRepository schedules;

	@Override
	public Schedule create(Schedule t) {
		return schedules.save(t);
	}

	@Override
	public Schedule read(Integer id) {
		return schedules.findOne(id);
	}

	@Override
	public Schedule update(Schedule t) {
		return schedules.save(t);
	}

	@Override
	public void delete(Integer id) {
		schedules.delete(id);
	}

	@Override
	public List<Schedule> findAll() {
		return schedules.findAll();
	}

}
