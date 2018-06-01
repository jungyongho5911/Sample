package com.spring.web.controller;

import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spirng.web.mapper.Mapper;
import com.spring.web.domain.Command;
import com.spring.web.domain.Customer;
import com.spring.web.domain.Path;
import com.spring.web.factory.ContextFactory;
import com.spring.web.service.IPostService;

@SessionAttributes("path,user")
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired Path path;
	@Autowired ContextFactory context;
	@Autowired Command cmd;
	@Autowired Customer customer;
	@Autowired Mapper mapper;
	@RequestMapping(value = "/user/mypage", method = RequestMethod.POST)
	public String userLogin(Locale locale, Model model,
			@RequestParam("input_login") String userId,
			@RequestParam("input_password") String userPass) {
		logger.info("유저마이 페이지 방문환영.", locale);
		System.out.println(userId);
		System.out.println(userPass);
		model.addAttribute("path", context.ptx());
		return "user.mypage";
	}
	@RequestMapping(value = "/user/join", method = RequestMethod.GET)
	public String userJoin(Locale locale, Model model) {
		logger.info("유저조인 페이지 방문환영.", locale);
		model.addAttribute("path", context.ptx());
		return "user.join";
	}
	@RequestMapping(value = "/user/join/insert", method = RequestMethod.POST)
	public String userJoinInsert(Locale locale, Model model,
			@RequestParam("input_join_id") String userId,
			@RequestParam("input_join_pass") String userPass,
			@RequestParam("input_join_email") String userEmail,
			@RequestParam("select_user_email") String userEmailSecond,
			@RequestParam("select_user_phoneNum") String userPhoneNum,
			@RequestParam("input_join_phoneNum") String userPhoneNumSecond) {
			customer.setCustomId(userId);
			customer.setCustomPass(userPass);
			customer.setEmail(userEmail+userEmailSecond);
			customer.setPhoneNum(userPhoneNum+userPhoneNumSecond);
			cmd.setCustomer(customer);
			new IPostService() {
				
				@Override
				public void execute(Command cmd) {
					mapper.insertUser(cmd);
					
				}
			}.execute(cmd);
		model.addAttribute("path", context.ptx());
		return "intro";
	}
}
