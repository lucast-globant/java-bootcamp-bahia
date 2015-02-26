package User;

import java.util.List;

public interface UserService {

	public void addUser(User user);
	public void modifyUser(User user);
	public void removeUser(int id);
	public List<User> getUsers();
	public void addFriend(User user, User friend);
	public void uploadPhoto(User user, Photo photo);
	public void likePhoto(User user, Photo photo);
}