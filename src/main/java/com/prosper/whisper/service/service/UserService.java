package com.prosper.whisper.service.service;

import java.util.List;

import com.prosper.whisper.service.bean.User;
import com.prosper.whisper.service.dao.UserDao;
import com.prosper.whisper.service.exception.DataIsExistException;
import com.prosper.whisper.service.exception.DataNotExistException;
import com.prosper.whisper.service.exception.InvalidParamException;
import com.prosper.whisper.service.exception.OperationIsDoneException;

public class UserService {
	
	private UserDao userDao;
	
	public void register(User user) {
		User userDb = userDao.getByEmail(user.getEmail());
		long now = System.currentTimeMillis();
		if (userDb == null) {
			user.setCreateTime(now);
			user.setLastUpdate(now);
			userDao.insert(user);
		} else if (!userDb.isVarified()) {
			user.setId(userDb.getId());
			user.setLastUpdate(now);
			userDao.updataUser(user);
		} else {
			throw new DataIsExistException();
		}
	}
	
	public void varify(long id, String code) {
		User user = userDao.getById(id);
		long now = System.currentTimeMillis();
		if (user.isVarified()) {
			throw new OperationIsDoneException();
		}
		if (!code.equals(user.getCode())) {
			throw new InvalidParamException();
		}
		user.setVarified(true);
		user.setCode("");
		user.setLastUpdate(now);
		user.setVarifyTime(now);
		userDao.updataUser(user);
	}
	
	public void login(String email, String password) {
		User user = userDao.getByEmailAndPass(email, password);
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
