package com.spring.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirng.web.mapper.Mapper;
import com.spring.web.domain.Command;
import com.spring.web.service.IPostService;
@Service
public class UserServiceImpl implements IPostService{
	@Autowired Mapper mapper;
	@Override
	public void execute(Command cmd) {
		mapper.insertUser(cmd);
		
	}

}
