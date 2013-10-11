package com.prosper.whisper.service.bean;

public class User {

	private long id;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String code;
	
	private boolean isVarified;
	
	private boolean isClosed;
	
	private String instruction;
	
	private long lastLogin;

	private long lastUpdate;
	
	private long createTime;
	
	private long varifyTime;
	
	public User() {	
		setId(0);
		setUserName("");
		setPassword("");
		setEmail("");
		setCode("");
		setClosed(true);
		setVarified(true);
		setInstruction("");
		setLastLogin(0);
		setLastUpdate(0);
		setCreateTime(0);
		setVarifyTime(0);
	}
	
	public User(String email, String userName, String password) {
		this(-1, email, userName, password);
	}
	
	public User(long id, String email, String userName, String password) {
		this();
		setId(id);
		setEmail(email);
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

	public boolean isVarified() {
		return isVarified;
	}

	public void setVarified(boolean isVarified) {
		this.isVarified = isVarified;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(long lastLogin) {
		this.lastLogin = lastLogin;
	}

	public long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getVarifyTime() {
		return varifyTime;
	}

	public void setVarifyTime(long varifyTime) {
		this.varifyTime = varifyTime;
	}

}
