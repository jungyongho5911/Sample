package com.spring.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.web.domain.Path;
import com.spring.web.factory.ContextFactory;

@SessionAttributes("path,user")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired Path path;
	@Autowired ContextFactory context;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("path", context.ptx());
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	@RequestMapping(value = "/move/intro", method = RequestMethod.GET)
	public String intro(Locale locale, Model model) {
		model.addAttribute("path", context.ptx());
		return "intro";
	}
	@RequestMapping(value="/main/login",method=RequestMethod.GET)
	public String loginForm(Model model) {
		model.addAttribute("path", context.ptx());
			return "login.board";
		
	}
	
}
