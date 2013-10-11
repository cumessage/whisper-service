package com.prosper.whisper.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prosper.whisper.service.bean.User;
import com.prosper.whisper.service.service.UserService;
import com.prosper.whisper.service.view.UserInfoView;
import com.prosper.whisper.service.view.UserMetsView;
import com.prosper.whisper.service.view.UserView;
import com.prosper.whisper.service.view.View;

@Controller
@RequestMapping(value="/user")
public class UserController { 
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="unchecked", method=RequestMethod.POST)
	@ResponseBody
	public View register(
			@RequestParam("email") String email,
			@RequestParam("username") String userName, 
			@RequestParam("password") String password) { 
		// TODO validate
		userService.register(new User(email, userName, password));
		return new View();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public View varify(@RequestParam("id") long id, @RequestParam("code") String code) {
		// TODO validate
		userService.varify(id, code);
		return new View();
	}
	
	@RequestMapping(value="/login")
	public View login(@RequestParam("email")String email, @RequestParam("password")String password) {
		// TODO validate
		userService.login(email, password);
		return new View();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public View getUser(@PathVariable("id") long id) {
		// TODO validate
		User user = userService.getUser(id);
		return new UserView(user);
	}
	
	@RequestMapping(value="/{id}/info", method=RequestMethod.GET)
	public View getUserInfo(@PathVariable("id") long id) {
		// TODO validate
		User user = userService.getUser(id);
		return new UserInfoView(user);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public View updateUser(@PathVariable("id") long id) {
		// TODO validate
		userService.updateUser(new User(id, "", "", ""));
		return new View();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public View deleteUser(@PathVariable("id") long id) {
		// TODO validate
		userService.deleteUser(id);
		return new View();
	}
	
	@RequestMapping(value="/{id}/met", method=RequestMethod.GET)
	public View getMet(@PathVariable("id") long id) {
		// TODO validate
		List<User> metList = userService.getMetList(id);
		return new UserMetsView(metList);
	}
	
	@RequestMapping(value="/{id}/met", method=RequestMethod.POST)
	public View addMet(@PathVariable("id") long id, long metId) {
		// TODO validate
		userService.addMet(id, metId);
		return new View();
	}
}
