package controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import interfaces.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController  {

	@Autowired
	private RoomService roomService;

	@RequestMapping("")
	@ResponseBody
	public String getRooms() {
		return roomService.toString();
	}
}

