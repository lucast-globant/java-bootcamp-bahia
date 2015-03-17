package com.aguirre.topic8.services;

import org.springframework.stereotype.Service;
import com.aguirre.topic8.models.ScheduleTime;

@Service
public interface ScheduleTimeService {

	public void addScheduleTime(ScheduleTime scheduleTime);

	public void deleteScheduleTime(ScheduleTime scheduleTime);

	public ScheduleTime getScheduleTime(Long idScheduleTime);
}
