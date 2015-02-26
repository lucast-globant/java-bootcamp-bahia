package keys_four_six_and_seven;

import java.util.LinkedList;
import java.util.List;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(int userId);

	public void updateUser(User user);

	public List<User> getAllUsers();

	public User getUserById(int userId);

	public void uploadFoto(Photo photo);

	public void addFriend(int userId, User friend);

	public void addLike(int userId, int photoId);
}
