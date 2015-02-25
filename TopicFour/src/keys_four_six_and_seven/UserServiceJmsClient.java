package keys_four_six_and_seven;

import java.util.LinkedList;

public class UserServiceJmsClient implements UserService {

	private UserService jmsObject;

	protected UserServiceJmsClient() {
		// jmsObject = code to get the reference to Service A from the jms call
	}

	@Override
	public void addUser(User user) {
		jmsObject.addUser(user);
	}

	@Override
	public void deleteUser(int userId) {
		jmsObject.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) {
		jmsObject.updateUser(user);
	}

	@Override
	public LinkedList<User> getAllUsers() {
		return jmsObject.getAllUsers();
	}

	@Override
	public User getUserById(int userId) {
		return jmsObject.getUserById(userId);
	}

	@Override
	public void uploadFoto(Photo photo) {
		jmsObject.uploadFoto(photo);
	}

	@Override
	public void addFriend(int userId, User friend) {
		jmsObject.addFriend(userId, friend);
	}

	@Override
	public void addLike(int userId, int photoId) {
		jmsObject.addLike(userId, photoId);
	}

}
