package com.prosper.whisper.service.dao;

import java.util.List;

import com.prosper.whisper.service.bean.User;
import com.prosper.whisper.service.mapper.UserMapper;

public class UserDao {
	
	private UserMapper userMapper;

	public void insert(User user) {
		userMapper.insertOne(user);
	}

	public User getByEmail(String email) {
		return userMapper.getByEmail(email);
	}
	
	public User getByEmailAndPass(String email, String password) {
		return userMapper.getByEmailAndPass(email, password);
	}

	public User getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updataUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getMetList(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMet(long id, long metId) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
