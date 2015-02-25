package keys_four_six_and_seven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class UserServiceImplementation implements UserService {

	private Map<Integer, User> users = new HashMap<Integer, User>();
	private Map<Integer, Photo> photos = new HashMap<Integer, Photo>();

	@Override
	public void addUser(User user) {
		users.put(user.getUserId(), user);
	}

	@Override
	public void deleteUser(int userId) {
		users.remove(userId);
	}

	@Override
	public void updateUser(User user) {
		users.put(user.getUserId(), user);
	}

	@Override
	public LinkedList<User> getAllUsers() {
		LinkedList<User> toR = new LinkedList<User>();
		Iterator<Entry<Integer, User>> it = users.entrySet().iterator();
		while (it.hasNext()) {
			toR.add(it.next().getValue());
		}
		return toR;
	}

	@Override
	public User getUserById(int userId) {
		return users.get(userId);
	}

	@Override
	public void uploadFoto(Photo photo) {
		photos.put(photo.getPhotoId(), photo);
	}

	@Override
	public void addFriend(int userId, User friend) {
		users.get(userId).addFirend(friend);
	}

	@Override
	public void addLike(int userId, int photoId) {
		photos.get(photoId).addLike(userId);
	}

}
