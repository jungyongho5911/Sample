package com.spring.web.service;

import org.springframework.stereotype.Service;

import com.spring.web.domain.Command;

@Service @FunctionalInterface
public interface IPostService {
	public void execute(Command cmd);
}
