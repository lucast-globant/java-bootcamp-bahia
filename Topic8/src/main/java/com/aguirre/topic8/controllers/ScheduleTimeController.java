package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.ScheduleTime;
import com.aguirre.topic8.services.ScheduleTimeService;

@ContextConfiguration
@RestController
@RequestMapping("/scheduletime")
public class ScheduleTimeController {

	@Autowired
	private ScheduleTimeService scheduleTimeService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public ScheduleTime addScheduleTime(int idCourse, String nameOfDay, String startTime, String endTime) {
		try {
			ScheduleTime scheduleTime = new ScheduleTime(idCourse, nameOfDay, startTime, endTime);
			scheduleTimeService.addScheduleTime(scheduleTime);
			return scheduleTime;
		} catch (Exception exception) {
			return null;
		}
	}

	@RequestMapping(value = "/delete/{idScheduleTime}", method = RequestMethod.DELETE)
	@ResponseBody
	public ScheduleTime deleteSchedulTime(@PathVariable Long idScheduleTime) {
		try {
			ScheduleTime scheduleTimeDeleted = scheduleTimeService.getScheduleTime(idScheduleTime);
			scheduleTimeService.deleteScheduleTime(scheduleTimeDeleted);
			return scheduleTimeDeleted;
		} catch (Exception exception) {
			return null;
		}
	}
}
