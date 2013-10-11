package com.prosper.whisper.service.mapper;

import org.apache.ibatis.annotations.Param;

import com.prosper.whisper.service.bean.User;

public interface UserMapper {
	
	public void insertOne(User user);

	public User getByEmail(String email);

	public User getByEmailAndPass(
		@Param("email")String email, @Param("password")String password
	);
	
}
