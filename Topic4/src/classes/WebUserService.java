package classes;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import interfaces.UserService;

public class WebUserService implements UserService {

	private List<WebUser> users;

	public WebUserService() {
		users = new ArrayList<WebUser>();
	}

	@Override
	public WebUserServiceResult createUser(String mail, String password, String name, String lastName) {
		WebUser user = readUser(mail);
		WebUserServiceResult result;
		if (user == null) {
			users.add(new WebUser(mail, password, name, lastName));
			result = new WebUserServiceResult(0, "Ok");
		} else {
			result = new WebUserServiceResult(1, "Fail, existent user");
		}
		return result;
	}

	@Override
	public WebUser readUser(String mail) {
		WebUser user = null;
		boolean located = false;
		Iterator<WebUser> iterator = users.iterator();
		WebUser current;
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
		WebUser user = readUser(mail);
		WebUserServiceResult result;
		if (user != null) {
			user.updateUser(mail, password, name, lastName);
			result = new WebUserServiceResult(0, "Ok");
		} else {
			result = new WebUserServiceResult(2, "Fail, inexistent user");
		}
		return result;
	}

	@Override
	public WebUserServiceResult deleteUser(String mail) {
		WebUser user = readUser(mail);
		WebUserServiceResult result;
		if (user != null) {
			users.remove(user);
			result = new WebUserServiceResult(0, "Ok");
		} else {
			result = new WebUserServiceResult(2, "Fail, inexistent user");
		}
		return result;
	}

	@Override
	public WebUserServiceResult uploadPhoto(String mail, Image photo) {
		WebUser user = readUser(mail);
		WebUserServiceResult result;
		if (user != null) {
			user.setPhoto(photo);
			result = new WebUserServiceResult(0, "Ok");
		} else {
			result = new WebUserServiceResult(2, "Fail, inexistent user");
		}
		return result;
	}

	@Override
	public WebUserServiceResult addFriend(String mailUser1, String mailUser2) {
		WebUserServiceResult result;
		if (mailUser1.equals(mailUser2)) {
			result = new WebUserServiceResult(3, "Fail, the emails are equals");
		} else {
			WebUser user1 = readUser(mailUser1);
			WebUser user2 = readUser(mailUser2);
			if (user1.areFriends(user2)) {
				result = new WebUserServiceResult(4, "Fail, users were already friends");
			} else {
				user1.addFriend(user2);
				user2.addFriend(user1);
				result = new WebUserServiceResult(0, "Ok");
			}
		}
		return result;
	}

	@Override
	public WebUserServiceResult addLike(String mailUser1, String mailUser2) {
		WebUser user1 = readUser(mailUser1);
		WebUser user2 = readUser(mailUser2);
		WebUserServiceResult result;
		if (user1.areFriends(user2)) {
			user2.addLikePhoto(user1);
			result = new WebUserServiceResult(0, "Ok");
		} else {
			result = new WebUserServiceResult(5, "Fail, users aren't friends");
		}
		return result;
	}
}
