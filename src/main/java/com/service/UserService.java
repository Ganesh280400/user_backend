package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dto.UserDto;

@Component
public interface UserService {
	public UserDto addUser( UserDto userdto);
	public List<UserDto> getUsers();

}
