package com.globant.app.actuator.controllers;

import com.globant.app.actuator.domain.entities.Room;
import com.globant.app.actuator.services.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/rooms")
public class RoomController  {

	@Autowired
	private IRoomService roomService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public Collection<Room> getAllRooms() {
		return roomService.all();
	}
}
