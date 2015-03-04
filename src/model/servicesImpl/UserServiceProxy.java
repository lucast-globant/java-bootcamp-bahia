package model.servicesImpl;

import model.User;
import api.UserService;


public class UserServiceProxy implements UserService{

	protected UserService implementation;
	
	public UserServiceProxy(UserService impl) {
		implementation=impl;
	}
	
	@Override
	public void create(User user) {
		implementation.create(user);
	}

	@Override
	public User getUser(String userName) {
		return implementation.getUser(userName);
	}

	@Override
	public boolean isTheUser(String userName) {
		return implementation.isTheUser(userName);
	}

	@Override
	public void delete(String userName) {
		implementation.delete(userName);
	}

	@Override
	public void update(String userName, User userUpdate) {
		implementation.update(userName, userUpdate);
	}

	@Override
	public void addFriend(User user, User friend) {
		implementation.addFriend(user, friend);
		
	}

	@Override
	public void giveALike(User user) {
		implementation.giveALike(user);
	}

	@Override
	public void uploadProfilePhoto(User user, String url) {
		implementation.uploadProfilePhoto(user, url);
	}

}
