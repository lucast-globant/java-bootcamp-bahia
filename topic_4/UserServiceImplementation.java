package topic_4;

import java.util.HashMap;
import java.util.Map;


public class UserServiceImplementation implements UserService {

	private Map<Integer,User> users;
	
	public UserServiceImplementation() {
		this.users = new HashMap<Integer,User>();
	}

	public void createUser (String name, String email, String password, int creditNumber) {
		User newUser = new User (name, email, password, creditNumber);
		users.put(newUser.getIdUser(), newUser);
	}
	
	public String readUser (User user) {
		return users.get(user.getIdUser()).toString();
	}
	
	public void deleteUser (User user) {
		users.remove(user.getIdUser());
	}
	
	public void updateUser (User user, String newEmail, String newPassword, int newCreditNumber) {
		users.get(user.getIdUser()).setEmail(newEmail);
		users.get(user.getIdUser()).setPassword(newPassword);
		users.get(user.getIdUser()).setCreditNumber(newCreditNumber);
	}
	
	public void uploadPhoto (User user, Photo picture) {
		users.get(user.getIdUser()).addPhoto(picture);
	}
	
	public void addPhotoLike (User user, Photo picture) {
		users.get(user.getIdUser()).addPhotoLike(picture);
	}
	
	public void addFriend (User user, User friend) {
		users.get(user.getIdUser()).addFriend(friend);
	}

	public User getUser(int userId) {
		return users.get(userId);
	}
	
}
