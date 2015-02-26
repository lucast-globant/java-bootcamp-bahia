package Model;

import API.UserService;

public class UserServiceProxy implements UserService{

	protected UserService implementation;
	
	public UserServiceProxy(UserService impl) {
		implementation=impl;
	}
	
	@Override
	public void create(CustomerService user) {
		implementation.create(user);
	}

	@Override
	public CustomerService getUser(String userName) {
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
	public void update(String userName, CustomerService userUpdate) {
		implementation.update(userName, userUpdate);
	}

	@Override
	public void addFriend(CustomerService user, CustomerService friend) {
		implementation.addFriend(user, friend);
		
	}

	@Override
	public void giveALike(CustomerService user) {
		implementation.giveALike(user);
	}

	@Override
	public void uploadProfilePhoto(CustomerService user, String url) {
		implementation.uploadProfilePhoto(user, url);
	}

}
