package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UserDto;
import com.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo repo;
	
	public List<UserDto> getUsers() {
		
		return repo.findAll();
	}

}
