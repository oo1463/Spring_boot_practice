package com.yujun.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yujun.firstapp.Dto.User;
import com.yujun.firstapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/find/{id}")
	public User findUser(@PathVariable("id") String id) {
		User u = userService.getUser(id);
		return u;
	}
}
