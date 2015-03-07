package com.aguirre.topic8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aguirre.topic8.models.ScheduleTime;
import com.aguirre.topic8.repositories.ScheduleTimeDao;
import com.google.gson.Gson;

@ContextConfiguration
@RestController
@RequestMapping("/scheduletime")
public class ScheduleTimeController {

	@Autowired
	private ScheduleTimeDao scheduleTimeDao;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String addScheduleTime(String jsonString) {
		Gson gson = new Gson();
		ScheduleTime scheduleTime = gson.fromJson(jsonString, ScheduleTime.class);
		scheduleTimeDao.save(scheduleTime);
		return gson.toJson(scheduleTime);
	}

	@RequestMapping(value = "/delete/{idScheduleTime}", method = RequestMethod.DELETE)
	public String deleteSchedulTime(@PathVariable Long idScheduleTime) {
		ScheduleTime scheduleTimeDeleted = scheduleTimeDao.findOne(idScheduleTime);
		scheduleTimeDao.delete(idScheduleTime);
		Gson gson = new Gson();
		return gson.toJson(scheduleTimeDeleted);
	}
}
