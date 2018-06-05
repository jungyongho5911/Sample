package com.spring.web.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spirng.web.mapper.Mapper;
import com.spring.web.domain.Board;
import com.spring.web.domain.Command;
import com.spring.web.domain.Page;
import com.spring.web.domain.Path;
import com.spring.web.factory.ContextFactory;
import com.spring.web.service.ICountService;
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
	@RequestMapping(value="/user/board", method=RequestMethod.GET)
	public String getArticles(Locale locale, Model model){
		Map<String, Object> map = new HashMap<>();
		int pageNum1 =1;
		int pageSize = 10;
		int blockSize = 5;
		int totalCount = new ICountService() {
			@Override
			public int excute(Command cmd) {
				return mapper.boardExist(cmd);
			}
		}.excute(cmd);
		System.out.println("2번째 전체 게시글 수 : "+totalCount);
		int totalPage = (totalCount % pageSize ==0) ? totalCount/pageSize : (totalCount/pageSize)+1;
		System.out.println("3번째 totalPage :"+totalPage );
	    int startRow = (pageNum1-1)*pageSize+1;
		System.out.println("4번째 startRow :"+startRow);
		int endRow= pageSize * pageNum1;
		System.out.println("5번째 endRow :"+endRow);
		int pageStart = (blockSize*((pageNum1-1)/blockSize))+1;
	    System.out.println("6번째 pageStart :"+pageStart);
		int pageEnd = (totalPage>blockSize) ? ((pageNum1 ==totalPage) ?  totalPage : (((pageNum1 -1)/blockSize) + 1) * blockSize)  : totalPage;
		System.out.println("7번째 pageEnd :"+pageEnd);
		boolean prevBlock =  (pageStart != 1);
		System.out.println("8번째 prevBlock :"+prevBlock);
		boolean nextBlock = (totalPage != pageEnd);
		System.out.println("9번째 nextBlock :"+nextBlock);
		cmd.setData1(String.valueOf(startRow));
		cmd.setData2(String.valueOf(endRow));
		List<String>seqList = new ArrayList<>();
		@SuppressWarnings("unchecked") 
		List<Board>list = (List<Board>) new IGetService1() {
			@Override
			public Object excute(Command cmd) {
				return mapper.selectAll(cmd);
			}
		}.excute(cmd);
		for(Board s : list) {
			seqList.add(s.getBbsSeq());
		}
		map.put("seqList", seqList);
		map.put("list", list);
		map.put("pageNum1", pageNum1);
		map.put("pageSize", pageSize);
		map.put("blockSize", blockSize);
		map.put("totalCount", totalCount);
		map.put("totalPage", totalPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("pageStart", pageStart);
		map.put("pageEnd", pageEnd);
		map.put("prevBlock", prevBlock);
		map.put("nextBlock", nextBlock);
		logger.info("board 시작 로우{}.", cmd.getData1());
		logger.info("board {}.", map);
		logger.info("board {}.", mapper.selectAll(cmd));
		model.addAttribute("path", context.ptx());
		return "user.board";
	}
	


	
}