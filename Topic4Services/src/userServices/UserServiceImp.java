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
		try {
			checkMap(users);
		} catch (EmptyMapException e) {
			e.printStackTrace();
		}
		users.get(id).getUserInfo();
	}

	public void delete(String id) {
		try {
			checkMap(users);
		} catch (EmptyMapException e) {

			e.printStackTrace();
		}
		users.remove(id);
	}

	public void update(String id, String property, String value) {
		try {
			checkMap(users);
		} catch (EmptyMapException e) {
			e.printStackTrace();
		}
		User u = users.get(id);
		u.update(property, value);
	}

	public void uploadPhoto(String id, Photo photo) {
		try {
			checkMap(users);
		} catch (EmptyMapException e) {
			e.printStackTrace();
		}
		users.get(id).insertPhoto(photo);
	}

	public void likePhoto(String id, Photo photo) {
		try {
			checkMap(users);
		} catch (EmptyMapException e) {
			e.printStackTrace();
		}
		users.get(id).addLikes(photo);
	}

	public void addFriends(String idUser, String idFriend) {
		try {
			checkMap(users);
		} catch (EmptyMapException e) {
			e.printStackTrace();
		}
		users.get(idUser).addFriend(idFriend);
	}

	private void checkMap(Map<String, User> users) throws EmptyMapException {

		if (users == null)
			throw new EmptyMapException();

	}

}
