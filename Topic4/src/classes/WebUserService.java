package classes;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import interfaces.User;
import interfaces.UserService;

public class WebUserService implements UserService {

	private List<User> users;

	public WebUserService() {
		users = new ArrayList<User>();
	}

	@Override
	public WebUserServiceResult createUser(String mail, String password, String name, String lastName) {
		User user = readUser(mail);
		if (user == null) {
			users.add(new WebUser(mail, password, name, lastName));
			return new WebUserServiceResult(0, "Ok");
		}
		return new WebUserServiceResult(1, "Fail, existent user");
	}

	@Override
	public User readUser(String mail) {
		User user = null;
		boolean located = false;
		Iterator<User> iterator = users.iterator();
		User current;
		while (!located && iterator.hasNext()) {
			current = iterator.next();
			if (mail.equals(current.getMail())) {
				located = true;
				user = current;
			}
		}
		return user;
	}

	@Override
	public WebUserServiceResult updateUser(String mail, String password, String name, String lastName) {
		User user = readUser(mail);
		if (user != null) {
			user.updateUser(mail, password, name, lastName);
			return new WebUserServiceResult(0, "Ok");
		}
		return new WebUserServiceResult(2, "Fail, inexistent user");
	}

	@Override
	public WebUserServiceResult deleteUser(String mail) {
		User user = readUser(mail);
		if (user != null) {
			users.remove(user);
			return new WebUserServiceResult(0, "Ok");
		}
		return new WebUserServiceResult(2, "Fail, inexistent user");
	}

	@Override
	public WebUserServiceResult uploadPhoto(String mail, Image photo) {
		User user = readUser(mail);
		if (user != null) {
			user.setPhoto(photo);
			return new WebUserServiceResult(0, "Ok");
		}
		return new WebUserServiceResult(2, "Fail, inexistent user");
	}

	@Override
	public WebUserServiceResult addFriend(String mailUser1, String mailUser2) {
		if (mailUser1.equals(mailUser2)) {
			return new WebUserServiceResult(3, "Fail, the emails are equals");
		}
		User user1 = readUser(mailUser1);
		User user2 = readUser(mailUser2);
		if (user1.areFriends(user2)) {
			return new WebUserServiceResult(4, "Fail, users were already friends");
		}
		user1.addFriend(user2);
		user2.addFriend(user1);
		return new WebUserServiceResult(0, "Ok");
	}

	@Override
	public WebUserServiceResult addLike(String mailUser1, String mailUser2) {
		User user1 = readUser(mailUser1);
		User user2 = readUser(mailUser2);
		if (user1.areFriends(user2)) {
			user2.addLikePhoto(user1);
			return new WebUserServiceResult(0, "Ok");
		}
		return new WebUserServiceResult(5, "Fail, users aren't friends");
	}
}
