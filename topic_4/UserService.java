package topic_4;

public interface UserService {
	
	public void createUser (String name, String email, String password, int creditNumber);
	public String readUser (User user);
	public User getUser (int userId);
	public void updateUser (User user, String newEmail, String newPassword, int newCreditNumber);
	public void deleteUser (User user);
	public void uploadPhoto (User user, Photo picture);
	public void addPhotoLike (User user, Photo picture);
	public void addFriend (User user, User friend);
	
}
