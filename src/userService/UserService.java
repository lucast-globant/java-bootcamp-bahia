package userService;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
	private List<User> users;

	public UserService() {
		users = new ArrayList<User>();
	}

	@Override
	public void addUser(String userId, String userName) {
		User user = new User(userId, userName);
		users.add(user);
	}

	@Override
	public void removeUser(String userId) {
		int index = getUserIndex(userId);
		if (index >= 0) {
			users.remove(index);
		}
	}

	private int getUserIndex(String userId) {
		int i = 0;
		boolean found = false;
		while (i < users.size() && !found) {
			found = users.get(i).getUserId().equals(userId);
			i++;
		}

		if (found) {
			return (i - 1);
		} else {
			return -1;
		}
	}

	@Override
	public void addLike(String fromUser, String toUser, int inPhoto) {
		int index = getUserIndex(toUser);
		if (index >= 0){
			User user = users.get(index);
			user.addLike(fromUser, inPhoto);
			users.set(index, user);
		}
	}

	@Override
	public void removeLike(String fromUser, String toUser, int inPhoto) {
		int index = getUserIndex(toUser);
		if (index >= 0){
			User user = users.get(index);
			user.removeLike(fromUser, inPhoto);
			users.set(index, user);
		}
	}

	@Override
	public void uploadPhoto(String userId, String photoURL,
			String photoDescription) {
		int index = getUserIndex(userId);
		if (index >= 0){
			User user = users.get(index);
			user.addPhoto(photoURL, photoDescription);
			users.set(index, user);
		}
	}

	@Override
	public void addFriend(String friend, String toUser) {
		int index = getUserIndex(toUser);
		if (index >= 0){
			User user = users.get(index);
			user.addFriend(friend);
			users.set(index, user);
		}
	}

	@Override
	public void removeFriend(String friend, String toUser) {
		int index = getUserIndex(toUser);
		if (index >= 0){
			User user = users.get(index);
			user.removeFriend(friend);
			users.set(index, user);
		}
	}

	@Override
	public int getNumberOfUsers() {
		return users.size();
	}

}
