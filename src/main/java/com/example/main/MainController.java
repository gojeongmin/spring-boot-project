package com.example.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView renderMainPage() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("username","Jeongmin");
		return mav;
	}
}
