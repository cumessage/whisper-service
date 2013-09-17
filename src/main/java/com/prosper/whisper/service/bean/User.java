package com.prosper.whisper.service.bean;

public class User {

	private long id;
	
	private String userName;
	
	private String password;
	
	private String name;
	
	private String instruction;
	
	private String wishes;
	
	public User() {	}
	
	public User(String userName, String password) {
		this(-1, userName, password);
	}
	
	public User(long id, String userName, String password) {
		setId(id);
		setUserName(userName);
		setPassword(password);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getWishes() {
		return wishes;
	}

	public void setWishes(String wishes) {
		this.wishes = wishes;
	}
	
}
