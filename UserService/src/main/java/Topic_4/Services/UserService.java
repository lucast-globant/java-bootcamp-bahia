package Topic_4.Services;

import Topic_4.Entities.Photo;
import Topic_4.Entities.User;

public interface UserService {

	public User createUser(String username, String name, String lastname, String password);

	public User readUser(String username);

	public void updateUser(User user, String name, String lastname, String password);

	public boolean deleteUser(User user);

	public void uploadPhoto(User user, String path);

	public boolean addFriend(User user, String friend);

	public boolean giveLike(User user, Photo photo);
}
