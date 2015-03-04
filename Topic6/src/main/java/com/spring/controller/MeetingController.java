package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Meeting;
import com.spring.service.MeetingService;

@Controller
@RequestMapping(value = "meeting")	
public class MeetingController {
	
	@Autowired
	private MeetingService MService;
	
	@RequestMapping(value ="viewAll", method = RequestMethod.GET)
	public ModelAndView viewAll() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("meetingViewAll");
		mav.addObject("meetings", MService.getMeetings());
		return mav;
	}
	
	@RequestMapping(value = "new", method = RequestMethod.GET)
	public ModelAndView newMeeting() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("newMeeting");
		mav.addObject("meeting", new Meeting());
		return mav;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute(value = "meeting") Meeting meeting) {
		MService.createMeeting(meeting);
		return "redirect:viewAll.htm";
	}
	
	@RequestMapping(value = "del", method = RequestMethod.GET)
	public ModelAndView removeMeeting() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("delMeeting");
		mav.addObject("meeting", new Meeting());
		return mav;
	}
	
	@RequestMapping(value="remove/{id}", method = RequestMethod.DELETE)
	public String remove(@ModelAttribute(value = "meeting") Long id) {
		MService.removeMeeting(id);
		return "redirect:viewAll.htm";
	}
	
	
	

}
