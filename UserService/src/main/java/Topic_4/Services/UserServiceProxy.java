package Topic_4.Services;

import Topic_4.Entities.Photo;
import Topic_4.Entities.User;

public class UserServiceProxy implements UserService {
	private UserService implementation;

	public UserServiceProxy(UserService implementation) {
		this.implementation = implementation;
	}

	public User createUser(String username, String name, String lastname, String password) {
		return implementation.createUser(username, name, lastname, password);
	}

	public User readUser(String username) {
		return implementation.readUser(username);
	}

	public void updateUser(User user, String name, String lastname, String password) {
		this.implementation.updateUser(user, name, lastname, password);
	}

	public boolean deleteUser(User user) {
		return implementation.deleteUser(user);
	}

	public void uploadPhoto(User user, String path) {
		implementation.uploadPhoto(user, path);
	}

	public boolean addFriend(User user, String friend) {
		return implementation.addFriend(user, friend);

	}

	public boolean giveLike(User user, Photo photo) {
		return implementation.giveLike(user, photo);
	}
}
