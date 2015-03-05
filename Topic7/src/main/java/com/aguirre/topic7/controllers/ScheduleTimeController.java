package com.aguirre.topic7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.topic7.models.ScheduleTime;
import com.aguirre.topic7.models.ScheduleTimeDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/scheduleTime")
public class ScheduleTimeController {

	@Autowired
	private ScheduleTimeDao scheduleTimeDao;

	@RequestMapping(method = RequestMethod.POST)
	public String addScheduleTime(String jsonString) {
		Gson gson = new Gson();
		ScheduleTime scheduleTime = gson.fromJson(jsonString, ScheduleTime.class);
		scheduleTimeDao.save(scheduleTime);
		return gson.toJson(scheduleTime);
	}
}
