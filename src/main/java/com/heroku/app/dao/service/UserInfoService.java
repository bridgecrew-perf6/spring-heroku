package com.heroku.app.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.heroku.app.dao.UserInfoDao;
import com.heroku.app.dto.UserInfoDto;

@Component
public class UserInfoService {
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	public List<UserInfoDto> getUserInfo() {
		return userInfoDao.getUserInfo();
	}

}
