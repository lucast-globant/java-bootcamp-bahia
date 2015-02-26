package keys_four_six_and_seven;

import java.util.LinkedList;
import java.util.List;

public class UserServiceProxy implements UserService {

	private UserService implementation;

	protected UserServiceProxy(UserService impl) {
		implementation = impl;
	}

	@Override
	public void addUser(User user) {
		implementation.addUser(user);
	}

	@Override
	public void deleteUser(int userId) {
		implementation.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) {
		implementation.updateUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return implementation.getAllUsers();
	}

	@Override
	public User getUserById(int userId) {
		return implementation.getUserById(userId);
	}

	@Override
	public void uploadFoto(Photo photo) {
		implementation.uploadFoto(photo);
	}

	@Override
	public void addFriend(int userId, User friend) {
		implementation.addFriend(userId, friend);
	}

	@Override
	public void addLike(int userId, int photoId) {
		implementation.addLike(userId, photoId);
	}

}
