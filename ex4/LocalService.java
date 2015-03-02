package ex4;

import java.util.List;

public class LocalService implements UserService {
	private Database db;

	public LocalService() {
		db=Database.getInstance();
	}

	@Override
	public void add(User userID) {
		db.addUser(userID);

	}

	@Override
	public void deleteUser(int userID) {
		db.deleteUser(userID);

	}

	@Override
	public User get(int userID) {
		// TODO Auto-generated method stub
		return db.getUser(userID);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return db.getUsers();
	}

	@Override
	public void uploadPhoto(Photo photo) {
		db.addPhoto(photo);

	}

	@Override
	public List<Photo> getPhotos(User user) {

		return db.getListPhotos(user);
	}

	@Override
	public void addFriend(User user1, User user2) {
		db.addFriend(user1, user2);

	}

	@Override
	public void likePhoto(User user1, Photo photo) {
		db.likePhoto(user1, photo);

	}

	@Override
	public void updateUser(int userID, User modifyUser) {
		db.updateUser(userID, modifyUser);

	}

	@Override
	public void unlikePhoto(User user, Photo photo) {
		db.unlikePhoto(user, photo);
		
	}

}
