package keys_four_six_and_seven;

import java.util.LinkedList;

public class UserServiceWebServiceClient implements UserService {

	private UserService webService;

	public UserServiceWebServiceClient() {
		// webService = code to get the reference to Service A from the
		// webservice call
	}

	@Override
	public void addUser(User user) {
		webService.addUser(user);
	}

	@Override
	public void deleteUser(int userId) {
		webService.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) {
		webService.updateUser(user);
	}

	@Override
	public LinkedList<User> getAllUsers() {
		return webService.getAllUsers();
	}

	@Override
	public User getUserById(int userId) {
		return webService.getUserById(userId);
	}

	@Override
	public void uploadFoto(Photo photo) {
		webService.uploadFoto(photo);
	}

	@Override
	public void addFriend(int userId, User friend) {
		webService.addFriend(userId, friend);
	}

	@Override
	public void addLike(int userId, int photoId) {
		webService.addLike(userId, photoId);
	}
}
