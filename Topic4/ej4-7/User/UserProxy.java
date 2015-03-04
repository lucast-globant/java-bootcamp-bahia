package User;

import java.util.List;

public class UserProxy implements UserService {
	
	UserService implementation;
	
	protected UserProxy(UserService imp) {
		this.implementation = imp;
	}

	@Override
	public void modifyUser(User user) {
		implementation.modifyUser(user);
	}

	@Override
	public void removeUser(int id) {
		implementation.removeUser(id);
	}

	@Override
	public void addFriend(User user, User friend) {
		implementation.addFriend(user, friend);
	}

	@Override
	public List<User> getUsers() {
		return implementation.getUsers();
	}

	@Override
	public void uploadPhoto(User user, Photo photo) {
		implementation.uploadPhoto(user, photo);
	}
	@Override
	public void addUser(User _user) {
		implementation.addUser(_user);
		
	}
	@Override
	public void likePhoto(User _user, Photo _photo) {
		implementation.likePhoto(_user, _photo);
		
	}

}
