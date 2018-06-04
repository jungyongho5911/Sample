package com.spring.web.service;



import org.springframework.stereotype.Service;

import com.spring.web.domain.Command;


@Service @FunctionalInterface
public interface IGetService1 {
	public Object execute(Command cmd);
	

}
