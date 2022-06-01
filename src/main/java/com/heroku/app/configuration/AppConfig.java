package com.heroku.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.heroku.app.dto.UserInfoDto;

@Configuration
public class AppConfig {

	@Bean
	public UserInfoDto userInfoDto() {
		UserInfoDto impl = new UserInfoDto();
		impl.setUserName("name");
		return impl;
	}

}
