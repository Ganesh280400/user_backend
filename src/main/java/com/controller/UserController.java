package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDto;
import com.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public UserDto addUser(@RequestBody UserDto userdto) {
		return service.addUser(userdto);
	}
	
	
	
	@GetMapping("/getUsers")
	public List<UserDto> getUsers() {
		return service.getUsers();
	}

}
