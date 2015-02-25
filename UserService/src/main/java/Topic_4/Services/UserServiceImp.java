package Topic_4.Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Topic_4.Entities.Photo;
import Topic_4.Entities.User;

public class UserServiceImp implements UserService {
	private Map<String, User> users;

	public UserServiceImp() {
		this.users = new HashMap<String, User>();
	}

	public User createUser(String username, String name, String lastname, String password) {
		if (users.containsKey(username)) {
			System.out.println("User already exists.");
			return null;
		} else {
			User user = new User(username, name, lastname, password);
			users.put(username, user);
			System.out.println("Created user.");
			return user;
		}
	}

	public User readUser(String username) {
		return users.get(username);
	}

	public void updateUser(User user, String name, String lastname, String password) {
		user.setName(name);
		user.setLastname(lastname);
		user.setPassword(password);
		System.out.println("Updated user.");
	}

	public boolean deleteUser(User user) {
		if (!users.containsKey(user.getUsername())) {
			System.out.println("The user doesn't exist.");
			return false;
		} else {
			users.remove(user.getUsername());
			return true;
		}
	}

	public void uploadPhoto(User user, String path) {
		Photo photo = new Photo(path);
		user.addPhoto(photo);
		System.out.println("Uploaded photo.");
	}

	public boolean addFriend(User user, String friend) {
		if (!users.containsKey(friend)) {
			System.out.println("The user doesn't exist.");
			return false;
		} else {
			Iterator<String> it = user.getFriends().iterator();
			boolean present = false;
			while (it.hasNext() && !present) {
				if (it.next().equals(friend))
					present = true;
			}
			if (present) {
				System.out.println("You are already friend of this user.");
				return false;
			} else {
				user.addFriend(friend);
				System.out.println("Added friend.");
				return true;
			}
		}
	}

	public boolean giveLike(User user, Photo photo) {
		Iterator<String> it = photo.getLikes().iterator();
		boolean present = false;
		while (it.hasNext() && !present) {
			if (it.next().equals(user.getUsername()))
				present = true;
		}
		if (present) {
			System.out.println("Already like this photo.");
			return false;
		} else {
			photo.addLike(user.getUsername());
			System.out.println("Added like.");
			return true;
		}
	}

}
