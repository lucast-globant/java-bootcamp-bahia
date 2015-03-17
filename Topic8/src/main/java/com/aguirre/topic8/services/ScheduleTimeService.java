package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.ScheduleTime;
import com.aguirre.topic8.repositories.ScheduleTimeDao;

@Service
public class ScheduleTimeService {

	@Autowired
	private ScheduleTimeDao scheduleTimeDao;

	public void addScheduleTime(ScheduleTime scheduleTime) {
		scheduleTimeDao.save(scheduleTime);
	}

	public void deleteScheduleTime(ScheduleTime scheduleTime) {
		scheduleTimeDao.delete(scheduleTime);
	}

	public ScheduleTime getScheduleTime(Long idScheduleTime) {
		return scheduleTimeDao.findOne(idScheduleTime);
	}
}
