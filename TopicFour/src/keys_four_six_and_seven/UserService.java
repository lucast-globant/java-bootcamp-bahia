package keys_four_six_and_seven;

import java.util.LinkedList;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(int userId);

	public void updateUser(User user);

	public LinkedList<User> getAllUsers();

	public User getUserById(int userId);

	public void uploadFoto(Photo photo);

	public void addFriend(int userId, User friend);

	public void addLike(int userId, int photoId);
}
