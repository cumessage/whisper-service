package com.prosper.whisper.service.view;

import com.prosper.whisper.service.bean.User;

public class UserView extends View {

	private User user;
	
	public UserView(User user) {
		super();
		setUser(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
