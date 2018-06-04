package com.spring.web.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spirng.web.mapper.Mapper;
import com.spring.web.domain.Command;
import com.spring.web.domain.Page;
import com.spring.web.domain.Path;
import com.spring.web.factory.ContextFactory;
import com.spring.web.service.IGetService1;
import com.spring.web.util.PageAdapter;

@SessionAttributes("path,user")
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired Path path;
	@Autowired Page page;
	@Autowired PageAdapter adapter;
	@Autowired ContextFactory context;
	@Autowired Command cmd;
	@Autowired Mapper mapper;
	@RequestMapping(value="/articles/", method=RequestMethod.POST)
	public Map<?,?> getArticles(@PathVariable String pageNum){
		logger.info("getArticles 들어옴 {}", "ENTERED");		
		System.out.println(pageNum);
		Map<String, Object> map = new HashMap<>();
		page.setPageNum(Integer.parseInt(pageNum));
		page.setBlockSize(5);
		page.setPageSize(5);
		page.setTotalCount(26);
		page = (Page) adapter.attr(page);
		cmd.setData1(page.getStartRow()+"");
		cmd.setData2(page.getEndRow()+"");
		map.put("list", (List<?>) new IGetService1() {
											@Override
											public Object execute(Command cmd) {
												return mapper.articles(cmd);
											}
										}.execute(cmd)
				);
		map.put("page", page);
		return map;
	}
	


	
}