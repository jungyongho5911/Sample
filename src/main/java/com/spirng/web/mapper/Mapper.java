package com.spirng.web.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.web.domain.Board;
import com.spring.web.domain.Command;

@Repository
public interface Mapper {
		 public void insertUser(Command cmd);
		 public HashMap<?,?> selectMypage(HashMap<?, ?> param);
		 public int totalPage(HashMap<?, ?> param);
		 public List<Board> articles(Command cmd);
 			 
}
