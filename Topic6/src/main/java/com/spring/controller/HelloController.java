package com.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class HelloController {

	@RequestMapping(value="")
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");  // view resolver will resolve it to hello.jsp
		mav.addObject("date", new Date());
		mav.addObject("showDate", true);
		return mav;
	}
}