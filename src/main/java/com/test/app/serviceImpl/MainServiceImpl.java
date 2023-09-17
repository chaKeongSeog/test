package com.test.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.dao.MainDao;
import com.test.app.dto.UserDto;
import com.test.app.service.MainService;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDao dao;

	@Override
	public List<UserDto> getUserInfo() {
		List<UserDto> lists = dao.getUserInfo();
		return lists;
	}
} 
