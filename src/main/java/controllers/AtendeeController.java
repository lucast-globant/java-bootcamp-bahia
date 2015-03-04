package controllers;

import interfaces.AtendeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/atendees")
public class AtendeeController {
	@Autowired
	private AtendeeService service;
	
	@RequestMapping("")
	@ResponseBody
	public String getInfo(){
		return "Hola";
	}
}
