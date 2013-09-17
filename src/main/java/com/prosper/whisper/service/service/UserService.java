package com.prosper.whisper.service.service;

import java.util.List;

import com.prosper.whisper.service.bean.User;
import com.prosper.whisper.service.dao.UserDao;
import com.prosper.whisper.service.exception.DataNotExistException;

public class UserService {
	
	private UserDao userDao;
	
	public void register(User user) {
		userDao.insert(user);
	}
	
	public void login(String userName, String password) {
		User user = userDao.getByUserNameAndPassword(userName, password);
		if (user == null) {
			throw new DataNotExistException();
		}
	}
	
	public User getUser(long id) {
		User user = userDao.getById(id);
		if (user == null) {
			throw new DataNotExistException();
		}
		return user;
	}
	
	public void updateUser(User user) {
		userDao.updataUser(user);
	}
	
	public void deleteUser(long id) {
		userDao.deleteUser(id);
	}
	
	public List<User> getMetList(long id) {
		List<User> metList = userDao.getMetList(id);
		return metList;
	}
	
	public void addMet(long id, long metId) {
		userDao.addMet(id, metId);
	}
	
}
