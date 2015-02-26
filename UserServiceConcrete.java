package topic4;

import java.util.ArrayList;
import java.util.List;

public class UserServiceConcrete implements UserService {

	private List<User> usersList;
	private List<Photo> photosList;

	public UserServiceConcrete() {
		usersList = new ArrayList<User> ();
		photosList = new ArrayList<Photo> ();
	}

	public void createUser(User u) {
		usersList.add(u);
	}

	public User readUser(int index) {
		return usersList.get(index);
	}

	public void updateUser (int index, String name, String pass, String email) {
		User u = usersList.get(index);
		u.setUserName(name);
		u.setUserPass(pass);
		u.setUserEmail(email);
		usersList.set(index, u);
	}

	public void deleteUser(User u) {
		usersList.remove(u);
	}

	public void addUserFriend(int index, User friend) {
		User u = usersList.get(index);
		u.addFriend(friend);
		usersList.set(index, u);
	}

	public void deleteUserFriend(int index, User friend) {
		User u = usersList.get(index);
		u.removeFriend(friend);
		usersList.set(index, u);
	}

	public void addUserLike(User u, Photo p) {
		int index = photosList.indexOf(p);
		p.getLikes().add(u);
		photosList.set(index, p);
	}

	public void deleteUserLike(User u, Photo p) {
		int index = photosList.indexOf(p);
		p.getLikes().remove(u);
		photosList.set(index, p);
	}
}
