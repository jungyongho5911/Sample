package com.spring.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.spirng.web.mapper.Mapper;
import com.spring.web.domain.Command;
import com.spring.web.domain.Customer;
import com.spring.web.domain.Path;
import com.spring.web.factory.ContextFactory;
import com.spring.web.service.IGetService;
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
			@RequestParam("input_password") String userPass,
			HttpServletRequest request) {
		Map<String,String> paramMap = new HashMap<>();
		paramMap.put("userid", userId);
		paramMap.put("userPass", userPass);
		Map<String, Object> map = new HashMap<>();
		map.put("mypage", new IGetService() {
			
			@Override
			public Object execute(HashMap<?, ?> param) {
				return mapper.selectMypage(param);
			}
		}.execute((HashMap<?, ?>) paramMap));
		model.addAttribute("user", map.get("mypage"));
		model.addAttribute("path", context.ptx());
		
		return "user.mypage";
	}
	@RequestMapping(value = "/user/join", method = RequestMethod.GET)
	public String userJoin(Locale locale, Model model) {
		model.addAttribute("path", context.ptx());
		return "user.join";
	}
	@RequestMapping(value = "/user/board", method = RequestMethod.GET)
	public String userBoard(Locale locale, Model model) {
		logger.info("유저보드 게시판 환영.", locale);
		model.addAttribute("path", context.ptx());
		return "user.board";
	}
	@RequestMapping(value = "/user/join/insert", method = RequestMethod.POST)
	public String userJoinInsert(Locale locale, Model model,
			@RequestParam("input_join_id") String userId,
			@RequestParam("input_join_pass") String userPass,
			@RequestParam("input_join_email") String userEmail,
			@RequestParam("select_user_email") String userEmailSecond,
			@RequestParam("select_user_phoneNum") String userPhoneNum,
			@RequestParam("input_join_phoneNum") String userPhoneNumSecond,
			@RequestParam("input_join_name") String userName) {
			customer.setCustomId(userId);
			customer.setCustomPass(userPass);
			customer.setName(userName);
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
