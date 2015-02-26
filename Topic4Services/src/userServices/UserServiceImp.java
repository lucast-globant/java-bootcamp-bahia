package userServices;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImp implements UserService {

	private Map<String, User> users;

	public UserServiceImp() {
		users = new HashMap<String, User>();
	}

	public void create(String id, String pass) {
		User user = new User(id, pass);
		users.put(id, user);
	}

	public void read(String id) {
		users.get(id).getUserInfo();
	}

	public void delete(String id) {
		users.remove(id);
	}

	public void update(String id, String property, String value) {
		User u = users.get(id);
		u.update(property, value);
	}

	public void uploadPhoto(String id, Photo photo) {
		users.get(id).insertPhoto(photo);
	}

	public void likePhoto(String id, Photo photo) {
		users.get(id).addLikes(photo);
	}

	public void addFriends(String idUser, String idFriend) {
		users.get(idUser).addFriend(idFriend);
	}

}
