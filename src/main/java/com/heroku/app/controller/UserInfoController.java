package com.heroku.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroku.app.dto.UserInfoDto;
import com.heroku.app.service.UserService;

@RestController
public class UserInfoController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/get")
	public List<UserInfoDto> getUserInfo() {
		return userService.userInfo();
	}

}
