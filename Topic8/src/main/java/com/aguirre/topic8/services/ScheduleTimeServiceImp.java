package com.aguirre.topic8.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.aguirre.topic8.models.ScheduleTime;
import com.aguirre.topic8.repositories.ScheduleTimeDao;

public class ScheduleTimeServiceImp implements ScheduleTimeService {

	@Autowired
	private ScheduleTimeDao scheduleTimeDao;

	@Override
	public void addScheduleTime(ScheduleTime scheduleTime) {
		scheduleTimeDao.save(scheduleTime);
	}

	@Override
	public void deleteScheduleTime(ScheduleTime scheduleTime) {
		scheduleTimeDao.delete(scheduleTime);
	}

	@Override
	public ScheduleTime getScheduleTime(Long idScheduleTime) {
		return scheduleTimeDao.findOne(idScheduleTime);
	}
}
