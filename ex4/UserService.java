package ex4;

import java.util.List;

public interface UserService {
	public void add(User userID);

	public void deleteUser(int userID);

	public User get(int userID);

	public void updateUser(int userID, User modifyUser);

	public List<User> getUsers();

	public void uploadPhoto(Photo photo);

	public List<Photo> getPhotos(User user);

	public void addFriend(User user1, User user2);

	public void likePhoto(User user, Photo photo);

	public void unlikePhoto(User user, Photo photo);

}
