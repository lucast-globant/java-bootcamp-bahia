package ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private Map<Integer, User> users;
	private Map<User, List<Photo>> photos;
	private static Database instance = new Database();

	private Database() {
		users = new HashMap<Integer, User>();
		photos = new HashMap<User, List<Photo>>();
	}

	public static Database getInstance() {
		return instance;

	}

	public void addUser(User user) {
		users.put(user.getID(), user);

	}

	public User getUser(int userID) {

		return users.get(userID);
	}

	public void deleteUser(int userID) {
		users.remove(userID);

	}

	public void updateUser(int userID, User modifyUser) {
		users.remove(userID);
		users.put(modifyUser.getID(), modifyUser);

	}

	public List<Photo> getListPhotos(User user) {
		return photos.get(user);
	}

	public void likePhoto(User user, Photo photo) {
		photo.addLike(user);

	}
	public void unlikePhoto(User user, Photo photo){
		photo.removeLike(user);
	}

	public void addFriend(User user1, User user2) {
		user1.addFriend(user2);

	}

	public void addPhoto(Photo photo) {
		List<Photo> photolist = photos.get(photo.getOwner());
		if (photolist != null)
			photolist.add(photo);
		else {
			photolist = new ArrayList<Photo>();
			photolist.add(photo);
			photos.put(photo.getOwner(), photolist);
		}

	}

	public List<User> getUsers() {
		return (List<User>) users.values();
	}

}
