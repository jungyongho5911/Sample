package com.spring.web.service;

import org.springframework.stereotype.Service;

import com.spring.web.domain.Command;

@Service
public interface ICountService {
	public int excute(Command cmd);
}
