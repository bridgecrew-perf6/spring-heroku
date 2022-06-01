package com.heroku.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroku.app.dao.service.UserInfoService;
import com.heroku.app.dto.UserInfoDto;

@Service
public class UserService {
	
	@Autowired
	private UserInfoService userInfoService;
	
	public List<UserInfoDto> userInfo() {
		return userInfoService.getUserInfo();
	}

}
