package com.spirng.web.mapper;

import org.springframework.stereotype.Repository;

import com.spring.web.domain.Command;

@Repository
public interface Mapper {
 public void insertUser(Command cmd);
 			 
}
